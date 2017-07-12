package com.epam.seliazniova.comparator;

import com.epam.seliazniova.entity.AbstractPublication;
import com.epam.seliazniova.entity.Book;

import java.util.Comparator;

/**
 * Created by Iryna_Seliazniova on 6/30/2017.
 */
public class GenreComparator implements Comparator<AbstractPublication> {
    @Override
    public int compare(AbstractPublication o1, AbstractPublication o2) {
          Book book1 = (Book)o1;
          Book book2 = (Book)o2;
          return book1.getGenre().compareTo(book2.getGenre());
    }
}
