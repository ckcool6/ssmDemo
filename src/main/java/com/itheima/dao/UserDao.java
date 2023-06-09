package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface UserDao {
    @Transactional(readOnly = false)
    public boolean save(User user);
    @Transactional(readOnly = false)
    public boolean update(User user);
    @Transactional(readOnly = false)
    public boolean delete(Integer uuid);
    public User get(Integer uuid);
    public List<User> getAll();
    public User getByUserNameAndPassWord(@Param("userName") String userName, @Param("password") String password);
}
