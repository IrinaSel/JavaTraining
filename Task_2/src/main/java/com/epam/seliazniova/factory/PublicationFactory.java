package com.epam.seliazniova.factory;

import com.epam.seliazniova.entity.AbstractPublication;
import com.epam.seliazniova.entity.Book;
import com.epam.seliazniova.entity.Journal;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Iryna_Seliazniova on 6/27/2017.
 */
public class PublicationFactory {
    @NotNull
    public static AbstractPublication getPublicationFromPublicationType(String publicationType){
        switch(publicationType){
            case "Book":
                return new Book();
            case "Journal":
                return new Journal();
            default:
                throw  new IllegalArgumentException("illegal type");
        }
    }
}
