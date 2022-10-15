package ru.tinkoff.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("customer")
public class Customer {
    @Id
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
}
