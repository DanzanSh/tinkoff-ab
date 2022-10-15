package ru.tinkoff.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.tinkoff.schema.Customer;
import ru.tinkoff.service.CustomerServiceInMemory;

@RestController
@RequestMapping(path = "/api/react/inMemory")
@RequiredArgsConstructor
public class ControllerInMemory {
    private final CustomerServiceInMemory customerServiceInMemory;

    @PostMapping("/customer")
    Mono<Void> create(@RequestBody Customer customerFlux) {
        return customerServiceInMemory.save(customerFlux);
    }

    @GetMapping("/customer")
    public Flux<Customer> list() {
        return customerServiceInMemory.findAll();
    }

    @GetMapping("/customer/{id}")
    public Mono<Customer> findById(@PathVariable Long id) {
        return customerServiceInMemory.findById(id);
    }

}
