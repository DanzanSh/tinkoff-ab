package ru.tinkoff.inheritance.joined.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.inheritance.joined.model.EmailNotification;

public interface EmailNotificationRepository extends JpaRepository<EmailNotification, Long> {
}
