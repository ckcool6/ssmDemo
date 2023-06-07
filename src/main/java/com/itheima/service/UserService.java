package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    public boolean save(User user);
    public boolean update(User user);
    public boolean delete(Integer uuid);
    public User get(Integer uuid);
    public List<User> getAll();
    public User login(String username, String password);
}
