package com.msubanner.spring.msubannerspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {
    @GetMapping("/")
    String home() {
        return "index";
    }
}