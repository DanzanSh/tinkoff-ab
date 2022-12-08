package ru.tinkoff.inheritance.joined.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.tinkoff.inheritance.joined.model.EmailNotification;
import ru.tinkoff.inheritance.joined.model.Notification;
import ru.tinkoff.inheritance.joined.model.SmsNotification;
import ru.tinkoff.inheritance.joined.repository.EmailNotificationRepository;
import ru.tinkoff.inheritance.joined.repository.NotificationRepository;
import ru.tinkoff.inheritance.joined.repository.SmsNotificationRepository;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final EmailNotificationRepository emailNotificationRepository;
    private final SmsNotificationRepository smsNotificationRepository;
    private final NotificationRepository notificationRepository;


    public Flux<EmailNotification> getAllEmailNotifications() {
        return Mono.just(emailNotificationRepository.findAll())
                .flatMapMany(Flux::fromIterable);
    }

    public Flux<SmsNotification> getAllSmsNotifications() {
        return Mono.just(smsNotificationRepository.findAll())
                .flatMapMany(Flux::fromIterable);
    }

    public Flux<Notification> getAllNotifications() {
        return Mono.just(notificationRepository.findAll())
                .flatMapMany(Flux::fromIterable);
    }
}