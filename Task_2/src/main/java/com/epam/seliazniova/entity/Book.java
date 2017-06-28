package com.epam.seliazniova.entity;

/**
 * Created by Iryna_Seliazniova on 6/27/2017.
 */
public class Book extends AbstractPublication {
    private String author;
    private String ISBN;
    private String genre;

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public Book() {
    }

    public Book(String author, String ISBN, String genre) {
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
    }

    public Book(String publisher, String publicationTitle, int numberOfPages, String author, String ISBN, String genre) {
        super(publisher, publicationTitle, numberOfPages);
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
    }
}
