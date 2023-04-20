package ru.astondevs.jenkintest.web;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;

@RestController()
@RequestMapping("/hello")
@Log
public class HelloWorldController {

    @GetMapping
    public String hello() {
        log.log(Level.WARNING, "We are here.");
        return "Hello World!";
    }
}
