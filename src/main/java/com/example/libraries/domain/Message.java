package com.example.libraries.domain;

import lombok.Data;

import java.net.URI;

@Data
public class Message {

    String title;
    String message;
    URI url;
}
