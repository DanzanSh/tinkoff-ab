package ru.tinkoff.inheritance.joined.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "email_notification")
public class EmailNotification extends Notification {
    @Column(name = "email_address")
    private String emailAddress;
}
