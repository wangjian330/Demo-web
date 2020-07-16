package com.mapper;

import com.pojo.UserLoginLog;

public interface UserLoginLogMapper {
    public int add(UserLoginLog userLoginLog);
    public UserLoginLog get(int login_id);
}
