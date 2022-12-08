package ru.kata.spring.boot_security_rest.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security_rest.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    boolean addUser(User user);

    User getUserById(Long id);

    boolean updateUser(User user);

    boolean deleteUserById(Long id);

    List<User> getAllUsers();

    User findByUsername(String name);
}