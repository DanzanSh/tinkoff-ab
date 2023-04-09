package ru.tinkoff.inheritance.singleTable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.inheritance.singleTable.model.Printer;

public interface PrinterRepository extends JpaRepository<Printer, Long> {
}