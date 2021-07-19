package com.itlifter.learn.security.repo;

import com.itlifter.learn.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
    User findByUsername(String username);
}
