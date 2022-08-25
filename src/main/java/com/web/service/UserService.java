package com.web.service;

import com.web.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);

    List<User> getAllUsers();
}
