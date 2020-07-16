package com.service;
import com.pojo.User;
import com.pojo.UserLoginLog;

public interface UserService {
    void add(User u);
    UserLoginLog get(String name, String password);

}
