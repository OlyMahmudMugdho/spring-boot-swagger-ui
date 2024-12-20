package com.mahmud.springbootswaggerui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/"})
public class DemoController {
    @GetMapping
    public Response hello() {
        return new Response("message", "Hello World");
    }
}
