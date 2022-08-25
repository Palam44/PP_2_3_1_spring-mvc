package com.web.dao;

import com.web.model.User;

import java.util.List;

public interface UserDao {

    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);

    List<User> getAllUsers();
}
