package com.epam.seliazniova.entity;

import java.util.ArrayList;

/**
 * Created by Iryna_Seliazniova on 7/4/2017.
 */
public class Library {
    private ArrayList<AbstractPublication> libraryList;

    public ArrayList<AbstractPublication> getLibraryList() {
        return libraryList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + libraryList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library1 = (Library) o;

        return libraryList != null ? libraryList.equals(library1.libraryList) : library1.libraryList == null;
    }

    @Override
    public int hashCode() {
        return libraryList != null ? libraryList.hashCode() : 0;
    }
}
