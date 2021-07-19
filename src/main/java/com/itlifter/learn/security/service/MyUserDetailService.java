package com.itlifter.learn.security.service;

import com.itlifter.learn.security.model.MyUserDetail;
import com.itlifter.learn.security.model.User;
import com.itlifter.learn.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=this.userRepo.findByUsername(username);
        if(user==null){
            throw new UsernameNotFoundException("No User");
        }
        return new MyUserDetail(user);
    }
}
