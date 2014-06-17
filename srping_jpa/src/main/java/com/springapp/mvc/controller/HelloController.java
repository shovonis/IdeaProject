package com.springapp.mvc.controller;

import com.springapp.mvc.domain.User;
import com.springapp.mvc.service.UserService;
import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class HelloController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        User user = userService.getUserById(2);
        System.out.println("user = " + user);
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(value = "/greetings/{userName}", method = RequestMethod.GET)
    public String printGreetings(@PathVariable String userName, ModelMap modelMap) {
        modelMap.addAttribute("userName", userName);
        return "hello";
    }


}