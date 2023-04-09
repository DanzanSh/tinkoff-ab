package ru.tinkoff.inheritance.tablePerClass.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.tinkoff.inheritance.tablePerClass.model.BlogPost;
import ru.tinkoff.inheritance.tablePerClass.model.Book;
import ru.tinkoff.inheritance.tablePerClass.service.PublicationService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/publication")
public class PublicationController {

    private final PublicationService publicationService;

    @GetMapping("/post")
    public Flux<BlogPost> getAllPosts() {
        return publicationService.getAllPosts();
    }

    @GetMapping("/book")
    public Flux<Book> getAllBooks() {
        return publicationService.getAllBooks();
    }

}
