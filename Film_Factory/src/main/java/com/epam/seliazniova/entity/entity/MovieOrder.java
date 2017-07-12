package com.epam.seliazniova.entity.entity;


import com.epam.seliazniova.entity.enums.Crew;
import com.epam.seliazniova.entity.enums.DevelopmentOperation;

import java.util.ArrayList;

/**
 * Created by Iryna_Seliazniova on 7/5/2017.
 */
public class MovieOrder {
    private int id;
    private String producer;
    private String movieName;
    private int numberOfEpisodes;
    private float totalPrice = 0;

    private ArrayList<Crew> crew = new ArrayList<Crew>();
    private ArrayList<DevelopmentOperation> developmentOperation= new ArrayList<DevelopmentOperation>();

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }
    public String getProducer() {
        return producer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ArrayList<Crew> getCrew() {

        return crew;
    }

    public ArrayList<DevelopmentOperation>  getDevelopmentOperation() {

        return developmentOperation;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void addToPrice(float price) {
        this.totalPrice = totalPrice + price;
    }

    @Override
    public String toString() {
        return "[" + id +
                ": " + producer +
                ": " + movieName +
                ": " + numberOfEpisodes +
                "]";
    }


}