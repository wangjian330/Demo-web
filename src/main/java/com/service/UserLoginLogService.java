package com.service;

import com.pojo.UserLoginLog;

public interface UserLoginLogService {
    void add(UserLoginLog ull);
    UserLoginLog get(int login_id);
}
