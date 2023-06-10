package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.controller.results.Code;
import com.itheima.controller.results.Result;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping
    public Result save(User user) {
        boolean flag = userService.save(user);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERROR);
    }

    @PutMapping
    public boolean update(User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{uuid}")
    public boolean delete(@PathVariable Integer uuid) {
        return userService.delete(uuid);
    }

    @GetMapping("/{uuid}")
    public User get(@PathVariable Integer uuid) {
        return userService.get(uuid);
    }

    @GetMapping("/{page}/{size}")
    public PageInfo<User> getAll(@PathVariable Integer page, @PathVariable Integer size) {
        return userService.getAll(page, size);
    }

    @PostMapping("/login")
    public User login(String userName, String password) {
        return userService.login(userName, password);
    }

}
