package com.guilherme.miguel.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Miguel Guilherme
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    private String id;
    private String name;
    private String author;
    private String isbn;

}
