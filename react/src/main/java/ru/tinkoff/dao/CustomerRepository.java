package ru.tinkoff.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.tinkoff.schema.Customer;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long> {
}
