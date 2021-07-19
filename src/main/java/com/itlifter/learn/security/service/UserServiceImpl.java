package com.itlifter.learn.security.service;

import com.itlifter.learn.security.model.User;
import com.itlifter.learn.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }
}
