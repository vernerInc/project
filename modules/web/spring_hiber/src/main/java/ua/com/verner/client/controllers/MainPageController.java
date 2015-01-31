package ua.com.verner.client.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author trancer
 * since 31.01.2015.
 */

@Controller
@RequestMapping({"/", "/home"})
public class MainPageController {

    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }
}
