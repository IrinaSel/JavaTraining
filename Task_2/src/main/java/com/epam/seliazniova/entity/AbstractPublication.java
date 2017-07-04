package com.epam.seliazniova.entity;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Created by Iryna_Seliazniova on 6/27/2017.
 */
public class AbstractPublication implements Comparable{
    //protected int id;
    private String publisher;
    private String publicationTitle;
    private int numberOfPages;

    //public int getId() { return id; }

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

    @Override
    public boolean equals(Object obj){
        if (obj==this){
            return true;
        }
        if (obj==null || !(obj instanceof Journal)){
            return false;
        }
        AbstractPublication aPublication = (AbstractPublication) obj;
        return numberOfPages == aPublication.numberOfPages
                && publisher.equals(aPublication.publisher)
                && publicationTitle.equals(aPublication.publicationTitle);
    }

    public int hashCode() {
        return Objects.hash(numberOfPages,publisher,publicationTitle);
    }

    @Override
    public int compareTo(@NotNull Object obj) {
        AbstractPublication aPublication = (AbstractPublication) obj;
        if (numberOfPages > aPublication.numberOfPages){
            return 1;
        }
        if (numberOfPages < aPublication.numberOfPages) {
            return -1;
        }
        return 0;
    }

}
