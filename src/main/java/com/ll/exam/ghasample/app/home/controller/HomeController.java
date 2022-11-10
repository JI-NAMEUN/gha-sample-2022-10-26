package com.ll.exam.ghasample.app.home.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final Environment environment;

    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "HOSTNAME : " + environment.getProperty("HOSTNAME");
    }
}