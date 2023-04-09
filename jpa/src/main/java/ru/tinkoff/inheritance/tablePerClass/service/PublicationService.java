package ru.tinkoff.inheritance.tablePerClass.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.tinkoff.inheritance.tablePerClass.model.BlogPost;
import ru.tinkoff.inheritance.tablePerClass.model.Book;
import ru.tinkoff.inheritance.tablePerClass.repository.BlogPostRepository;
import ru.tinkoff.inheritance.tablePerClass.repository.BookRepository;

@Service
@RequiredArgsConstructor
public class PublicationService {
    private final BlogPostRepository blogPostRepository;
    private final BookRepository bookRepository;

    public Flux<BlogPost> getAllPosts() {
        return Mono.just(blogPostRepository.findAll())
                .flatMapMany(Flux::fromIterable);
    }

    public Flux<Book> getAllBooks() {
        return Mono.just(bookRepository.findAll())
                .flatMapMany(Flux::fromIterable);
    }
}
