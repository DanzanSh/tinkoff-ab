package ru.tinkoff.controller;

import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.tinkoff.schema.Customer;
import ru.tinkoff.service.CustomerService;

@RestController
@RequestMapping(path = "/api/react")
@RequiredArgsConstructor
public class Controller {

    private final CustomerService customerService;

    @PostMapping("/customer")
    Mono<Void> create(@RequestBody Publisher<Customer> customerFlux) {
        return customerService.saveAll(customerFlux);
    }

    @GetMapping("/customer")
    public Flux<Customer> list() {
        return customerService.findAll();
    }

    @GetMapping("/customer/{id}")
    public Mono<Customer> findById(@PathVariable Long id) {
        return customerService.findById(id);
    }
}
