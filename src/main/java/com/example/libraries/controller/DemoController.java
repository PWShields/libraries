package com.example.libraries.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Value("${demo.image}")
    private String image;

    @GetMapping()
    public String home(Model model){
        model.addAttribute("image",image);
        model.addAttribute("name","National Library of Wales");
        model.addAttribute("isil","GB-WlAbNL");
        return "demo/show";
    }

}
