package com.controller;

import com.pojo.User;
import com.pojo.UserLoginLog;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public ModelAndView addUser(User user){
        userService.add(user);
        ModelAndView mav = new ModelAndView("redirect:/success");
        return mav;
    }
    @RequestMapping("login")
    public ModelAndView login( String name,String password){
        UserLoginLog ull = userService.get(name,password);
        ModelAndView mav = new ModelAndView();
        mav.addObject("ull",ull);
        mav.setViewName("successLogin");
        return mav;
    }
}
