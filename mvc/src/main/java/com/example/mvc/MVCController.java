package com.example.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MVCController {
    @GetMapping("test")
    public String test() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(300);
        }
        return "ok";
    }

}
