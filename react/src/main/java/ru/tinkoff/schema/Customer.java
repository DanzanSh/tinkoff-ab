package ru.tinkoff.schema;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("customer")
public class Customer {
    @Id
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
}
