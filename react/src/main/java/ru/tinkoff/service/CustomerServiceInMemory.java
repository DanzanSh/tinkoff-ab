package ru.tinkoff.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.tinkoff.schema.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceInMemory {

    List<Customer> customers = new ArrayList<>();

    public Mono<Void> save(Customer customerFlux) {
        customers.add(customerFlux);
        return Mono.empty();
    }

    public Mono<Customer> findById(Long id) {
        Customer customerByID = customers.stream().
                                    filter(customer -> customer.getId().equals(id))
                                    .findAny()
                                    .orElse(new Customer());
        return Mono.just(customerByID);
    }

    public Flux<Customer> findAll() {
        return Mono.just(customers).flatMapMany(Flux::fromIterable);
    }
}
