package ru.tinkoff.service;

import org.springframework.stereotype.Service;

@Service
public class AspectService {

    public void print() {
        System.out.println("AspectService, print");
    }

    public void printWithException() {
        System.out.println("AspectService, printWithException");
        throw new RuntimeException();
    }
}
