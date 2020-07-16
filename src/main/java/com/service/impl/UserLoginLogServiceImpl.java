package com.service.impl;

import com.mapper.UserLoginLogMapper;
import com.pojo.UserLoginLog;
import com.service.UserLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginLogServiceImpl  implements UserLoginLogService {
    @Autowired
    UserLoginLogMapper userLoginLogMapper;

    public void add(UserLoginLog ull) {
        userLoginLogMapper.add(ull);
    }

    public UserLoginLog get(int login_id) {
        return userLoginLogMapper.get(login_id);
    }
}
