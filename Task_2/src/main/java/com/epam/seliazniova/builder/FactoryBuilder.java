package com.epam.seliazniova.builder;

import com.epam.seliazniova.entity.AbstractPublication;
import com.epam.seliazniova.entity.Book;
import com.epam.seliazniova.entity.Journal;
import com.epam.seliazniova.factory.FactoryBook;
import com.epam.seliazniova.factory.FactoryJournal;
import com.epam.seliazniova.factory.PublicationFactory;

/**
 * Created by Iryna_Seliazniova on 6/28/2017.
 */
public class FactoryBuilder {

        public static PublicationFactory getFactoryFromPublicationType(String publicationType){
            switch(publicationType){
                case "Book":
                    return new FactoryBook();
                case "Journal":
                    return new FactoryJournal();
                default:
                    throw  new IllegalArgumentException("illegal type");
            }
        }

}
