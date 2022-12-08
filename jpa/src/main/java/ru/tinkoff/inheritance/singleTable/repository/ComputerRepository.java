package ru.tinkoff.inheritance.singleTable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.inheritance.singleTable.model.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
