package ru.tinkoff.inheritance.tablePerClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.inheritance.tablePerClass.model.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}