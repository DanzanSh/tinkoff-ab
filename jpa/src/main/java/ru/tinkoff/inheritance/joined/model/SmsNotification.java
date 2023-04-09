package ru.tinkoff.inheritance.joined.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "sms_notification")
public class SmsNotification extends Notification {
    @Column(name = "phone_number")
    private String phoneNumber;
}
