package com.controller;

import com.pojo.UserLoginLog;
import com.service.UserLoginLogService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class UserLoginLogController {
    @Autowired
    UserLoginLogService userLoginLogService;

    @RequestMapping(value = "/userLoginLogs",method = RequestMethod.POST)
    public ModelAndView addUserLoginLog(UserLoginLog userLoginLog){
        userLoginLogService.add(userLoginLog);
        ModelAndView mav = new ModelAndView("redirect:/successLogin");
        return mav;
    }
}
