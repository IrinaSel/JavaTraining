package com.epam.seliazniova.comparator;

import com.epam.seliazniova.entity.AbstractPublication;

import java.util.Comparator;

/**
 * Created by Iryna_Seliazniova on 6/28/2017.
 */
public class NumberOfPagesComparator implements Comparator<AbstractPublication> {
    @Override
    public int compare(AbstractPublication o1, AbstractPublication o2) {
        if (o1.getNumberOfPages() > o2.getNumberOfPages()){
            return 1;
        }
        if (o1.getNumberOfPages() < o2.getNumberOfPages()) {
            return -1;
        }
        return 0;
    }
}
