package com.ketanecom.ecomweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(){
        return "index";
    }

    @RequestMapping("profile")
    public String profile(){
        return "profile";
    }
}
