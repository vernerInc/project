package ua.com.verner.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.com.verner.back.entity.user.User;
import ua.com.verner.back.services.user.UserService;

/**
 * author trancer
 * since 31.01.2015.
 */

@Controller
@RequestMapping({"/"})
public class MainPageController {

    @Autowired
    private UserService userService;

    @RequestMapping({"/", "/home"})
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/checkLogin", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam("login") String login, @RequestParam("password") String password) {
        ModelAndView modelAndView = new ModelAndView("index");
        User user = userService.selectByLogin(login);
        if (user != null) {
            if(user.getPassword().equals(password)){
                modelAndView.addObject("result", true);
                modelAndView.addObject("user", user);
            }
        } else {
            modelAndView.addObject("result", false);
        }
        return modelAndView;
    }
}
