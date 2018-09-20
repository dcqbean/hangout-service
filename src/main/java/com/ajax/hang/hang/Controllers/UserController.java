package com.ajax.hang.hang.Controllers;

import com.ajax.hang.hang.dto.UserDTO;
import com.ajax.hang.hang.sevices.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    UserSevice userSevice;

    @GetMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("");
        return mav;
    }

    @GetMapping(value = "/login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        mav.addObject("user", new UserDTO());// Object user biding data
        return mav;
    }

    @PostMapping(value = "/login-process")
    public String loginProcess(UserDTO userDTO){
        userSevice.loginUser(userDTO);
        return "redirect:/login";
    }
}
