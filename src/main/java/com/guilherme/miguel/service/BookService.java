package com.guilherme.miguel.service;

import com.guilherme.miguel.domain.Book;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.UUID.randomUUID;

/**
 * @author Miguel Guilherme
 */
@Service
public class BookService {

    public Collection<Book> getBooks() {
        List<Book> books = asList(
                new Book(randomUUID().toString(), "Spring Boot in Action", "Craig Walls", "9781617292545"),
                new Book(randomUUID().toString(), "Java 8 Lambdas", "Richard Warburton", "9781449370770"),
                new Book(randomUUID().toString(), "Scala for the Impatient", "Cay S. Horstmann", "9780134540566"),
                new Book(randomUUID().toString(), "Head First JavaScript Programming", "Eric Freeman , By (author)  Elisabeth Robson", "9781449340131"),
                new Book(randomUUID().toString(), "Maven: The Definitive Guide", "Sonatype Company", "9780596517335"),
                new Book(randomUUID().toString(), "IntelliJ Idea Essentials", "Jaroslaw Krochmalski", "9781784396930"),
                new Book(randomUUID().toString(), "Kotlin in Action", "Dmitry Jemerov , By (author)  Svetlana Isakova", "9781617293290")
        );

        return books;
    }

}
