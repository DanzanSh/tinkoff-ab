package ru.tinkoff.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.service.AspectService;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class Controller {
    private final AspectService aspectService;

    @GetMapping("/print")
    public void print() {
        aspectService.print();
    }

    @GetMapping("/print/exception")
    public void printWithException() {
        aspectService.printWithException();
    }
}
