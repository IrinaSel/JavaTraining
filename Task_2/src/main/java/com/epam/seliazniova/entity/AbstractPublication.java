package com.epam.seliazniova.entity;

/**
 * Created by Iryna_Seliazniova on 6/27/2017.
 */
public class AbstractPublication {
    protected String publisher;
    protected String publicationTitle;
    protected int numberOfPages;

    public String getPublisher() {
        return publisher;
    }

    public String getPublicationTitle() {
        return publicationTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public AbstractPublication() {
    }

    public AbstractPublication(String publisher, String publicationTitle, int numberOfPages) {
        this.publisher = publisher;
        this.publicationTitle = publicationTitle;
        this.numberOfPages = numberOfPages;
    }
}
