package org.example.task1.simple.spring.boot.service.in.docker.and.docker.compose.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DockerMessageController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/count")
    public Long getMessage() {
        return counter.incrementAndGet();
    }
}
