package com.restexample.train;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GRController {
    @GetMapping({"/","/home"})
    public String Home( ) {
        return "home";
    }

    @GetMapping("/hello")
    public String Hello( ) {
        return "hello";
    }


}
