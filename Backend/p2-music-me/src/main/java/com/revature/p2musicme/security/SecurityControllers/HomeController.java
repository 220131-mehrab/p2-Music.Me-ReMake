package com.revature.p2musicme.security.SecurityControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class HomeController {
    @GetMapping(value = "home")
    public String home() {
        return "Home";
    }
}
