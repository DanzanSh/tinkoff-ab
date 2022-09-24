package ru.tinkoff.service;

import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.tinkoff.dao.CustomerRepository;
import ru.tinkoff.schema.Customer;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Mono<Void> saveAll(Publisher<Customer> customerFlux) {
        return customerRepository.saveAll(customerFlux).then();
    }

    public Mono<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public Flux<Customer> findAll() {
        return customerRepository.findAll();
    }
}
