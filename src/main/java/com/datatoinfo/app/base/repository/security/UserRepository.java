package com.datatoinfo.app.base.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datatoinfo.app.base.model.security.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
