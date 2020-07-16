package com.mapper;

import com.pojo.User;

public interface UserMapper {
    public int add(User user);
    public User get(String name,String password);
}
