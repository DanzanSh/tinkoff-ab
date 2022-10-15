package ru.tinkoff.utils;

import ru.tinkoff.schema.Customer;

public class TestUtils {

    public static Customer createCustomer() {
        return new Customer(1L, "Ivan", "Ivanov");
    }
}
