package com.itheima.service;


import com.itheima.pojo.User;

public interface UserService {
    User login(String username, String password);
    boolean register(User user);
}
