package com.example.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class WebFluxController {
    @GetMapping("test")
    public Mono<String> test() throws InterruptedException {
         Mono<String> ok = Mono.just("ok");
        for (int i = 0; i < 3; i++) {
            ok = ok.delayElement(Duration.ofMillis(300));
        }
        return ok;
    }
}
