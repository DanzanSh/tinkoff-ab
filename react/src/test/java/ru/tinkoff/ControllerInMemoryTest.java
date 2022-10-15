package ru.tinkoff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;
import ru.tinkoff.schema.Customer;

import static ru.tinkoff.utils.TestUtils.createCustomer;

@SpringBootTest
@AutoConfigureWebTestClient
public class ControllerInMemoryTest {

    @Autowired
    private WebTestClient webTestClient;

    private Customer customer;
    private WebTestClient.ResponseSpec responseSpec;

    @Test
    public void testCreateCustomer() {
        givenCustomer(new Customer());
        whenPostRequest("/api/react/inMemory/customer", customer);
        thenShouldBeSuccessful(responseSpec);
    }

    private void thenShouldBeSuccessful(WebTestClient.ResponseSpec responseSpec) {
        responseSpec
                .expectStatus()
                .is2xxSuccessful();
    }

    private void whenPostRequest(String stringPath, Customer customer) {
        responseSpec = webTestClient.post()
                .uri(stringPath)
                .body(Mono.just(customer), Customer.class)
                .exchange();
    }

    private void givenCustomer(Customer customer) {
        this.customer = customer;
    }

    @Test
    public void testCreateAndGetNotNull() {
        Customer customer = createCustomer();

        webTestClient.post()
                .uri("/api/react/inMemory/customer")
                .body(Mono.just(customer), Customer.class)
                .exchange().expectStatus().isOk();

        webTestClient.get()
                .uri("/api/react/inMemory/customer/1")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .consumeWith(response ->
                        Assertions.assertNotNull(response.getResponseBody()));
    }

    @Test
    public void getEmptyList() {
        webTestClient.get()
                .uri("/api/react/inMemory/customer")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(Customer.class);
    }

}
