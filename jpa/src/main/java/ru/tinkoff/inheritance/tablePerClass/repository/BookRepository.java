package ru.tinkoff.inheritance.tablePerClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.inheritance.tablePerClass.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}