package edu.tomerbu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tomerbuzaglo on 12/02/2017.
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }

}
