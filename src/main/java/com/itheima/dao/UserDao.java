package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    public boolean save(User user);
    public boolean update(User user);
    public boolean delete(Integer uuid);
    public User get(Integer uuid);
    public List<User> getAll();
    public User getByUserNameAndPassWord(@Param("userName") String userName, @Param("password") String password);
}
