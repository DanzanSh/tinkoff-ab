package ru.tinkoff.inheritance.joined.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.inheritance.joined.model.SmsNotification;

public interface SmsNotificationRepository extends JpaRepository<SmsNotification, Long> {
}
