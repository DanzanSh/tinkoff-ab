package ru.tinkoff.inheritance.joined.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.inheritance.joined.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
