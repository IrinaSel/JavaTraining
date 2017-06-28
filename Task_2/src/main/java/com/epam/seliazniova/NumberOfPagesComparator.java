package com.epam.seliazniova;

import com.epam.seliazniova.entity.AbstractPublication;

/**
 * Created by Iryna_Seliazniova on 6/28/2017.
 */
public class NumberOfPagesComparator implements Comparable<AbstractPublication> {
    @Override
    public int compareTo( AbstractPublication abstractPublication) {
        return 0;
        //return Integer.compare(numberOfPages, abstractPublication.numberOfPages);
    }
}
