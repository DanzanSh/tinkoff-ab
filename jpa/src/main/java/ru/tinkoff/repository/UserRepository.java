package ru.tinkoff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
