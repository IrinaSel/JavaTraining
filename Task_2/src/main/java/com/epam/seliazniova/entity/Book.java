package com.epam.seliazniova.entity;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Created by Iryna_Seliazniova on 6/27/2017.
 */
public class Book extends AbstractPublication implements Comparable{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (ISBN != null ? !ISBN.equals(book.ISBN) : book.ISBN != null) return false;
        return genre != null ? genre.equals(book.genre) : book.genre == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (ISBN != null ? ISBN.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(@NotNull Object obj) {
        Book book = (Book) obj;
        return ISBN.compareTo(book.ISBN);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
