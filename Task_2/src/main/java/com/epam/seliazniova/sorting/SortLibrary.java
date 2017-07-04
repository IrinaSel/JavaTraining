package com.epam.seliazniova.sorting;

import com.epam.seliazniova.comparator.GenreComparator;
import com.epam.seliazniova.comparator.NumberOfPagesComparator;
import com.epam.seliazniova.entity.AbstractPublication;
import com.epam.seliazniova.entity.Library;

import java.util.ArrayList;

/**
 * Created by Iryna_Seliazniova on 7/4/2017.
 */
public class SortLibrary {
    public Library sortLibraryByNumbOfPagesAndGenre(Library library){
        GenreComparator genreComparator = new GenreComparator();
        NumberOfPagesComparator numberOfPagesComparator = new NumberOfPagesComparator();
        library.getLibraryList().sort(numberOfPagesComparator.thenComparing(genreComparator));
        return  library;
    }
}
