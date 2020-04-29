package com.example.libraries.controller;

import com.example.libraries.domain.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@Slf4j
@RestController
@RequestMapping("/")
public class HomeRestController {

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Message home() {
        Message message = new Message();
        message.setTitle("Welcome to Libraries API");
        message.setMessage("Please refer to the link below for information on how to use this API");
        message.setUrl(URI.create("https://app.swaggerhub.com/apis/bondistudio/australian-library_gateway/1.0.0#free"));
        return message;
    }
}
