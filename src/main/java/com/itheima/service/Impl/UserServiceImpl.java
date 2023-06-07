package com.itheima.service.Impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    public boolean save(User user) {
        return userDao.save(user);
    }

    public boolean update(User user) {
        return false;
    }

    public boolean delete(Integer uuid) {
        return false;
    }

    public User get(Integer uuid) {
        return null;
    }

    public List<User> getAll() {
        return null;
    }

    public User login(String username, String password) {
        return null;
    }
}
