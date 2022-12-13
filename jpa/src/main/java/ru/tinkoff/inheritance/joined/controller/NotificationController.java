package ru.tinkoff.inheritance.joined.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.tinkoff.inheritance.joined.model.EmailNotification;
import ru.tinkoff.inheritance.joined.model.Notification;
import ru.tinkoff.inheritance.joined.model.SmsNotification;
import ru.tinkoff.inheritance.joined.service.NotificationService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/notification")
public class NotificationController {

    private final NotificationService notificationService;

    @GetMapping("/email")
    public Flux<EmailNotification> getAllEmailNotifications() {
        return notificationService.getAllEmailNotifications();
    }

    @GetMapping("/sms")
    public Flux<SmsNotification> getAllSmsNotifications() {
        return notificationService.getAllSmsNotifications();
    }

    @GetMapping
    public Flux<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }
}