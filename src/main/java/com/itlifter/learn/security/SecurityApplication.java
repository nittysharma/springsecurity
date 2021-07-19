package com.itlifter.learn.security;

import com.itlifter.learn.security.model.User;
import com.itlifter.learn.security.repo.UserRepo;
import com.itlifter.learn.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SecurityApplication implements CommandLineRunner {
    @Autowired
    UserRepo userRepo;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> users=new ArrayList<>();
        users.add(new User("Nitin",passwordEncoder.encode("password"),"ROLE_ADMIN"));
        users.add(new User("Rubi",passwordEncoder.encode("password"),"ROLE_NORMAL"));
        userRepo.saveAll(users);
    }
}