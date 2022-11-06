package com.yayegor.web.dao;


import com.yayegor.web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Long id);
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    User getUserByName(String name);
}
