package ru.tinkoff.inheritance.singleTable.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Getter
@Setter
@Entity
@DiscriminatorValue("computer")
public class Computer extends Device {
    private String os;
}
