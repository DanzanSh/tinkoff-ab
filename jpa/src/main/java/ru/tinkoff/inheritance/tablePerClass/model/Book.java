package ru.tinkoff.inheritance.tablePerClass.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book extends Publication {
    @Column(name = "pages")
    private int pages;
}