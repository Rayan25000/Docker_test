package com.rayan.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class WebServices {
    String contacts = "";

    @GetMapping(value ="/hello")
    String getContacts() {
        return "<html><body><h1>coucou</h1></body></html>";
    }
}