package ru.tinkoff.inheritance.tablePerClass.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "blog_post")
public class BlogPost extends Publication {
    @Column(name = "url")
    private String url;
}
