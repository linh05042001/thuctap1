package com.example.thuctap1.service;

import com.example.thuctap1.model.User;

import java.util.List;

public interface UserService {

    public User addUser(User user);

    public User editUser(long id, User user);
    public boolean deleteUser(long id);
    public List<User> selectUser();
}
