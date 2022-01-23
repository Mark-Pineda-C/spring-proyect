package com.sha.springbootproject.service;

import java.util.Optional;

import com.sha.springbootproject.model.Role;
import com.sha.springbootproject.model.User;

public interface UserService {
    User saveUser(User user);
    Optional<User> findByUsername(String username);
    void changeRole(Role newRole, String username);
}
