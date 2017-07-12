package com.epam.seliazniova.entity.builder;

import com.epam.seliazniova.entity.entity.MovieOrder;
import com.epam.seliazniova.entity.enums.Crew;
import com.epam.seliazniova.entity.enums.DevelopmentOperation;
import com.epam.seliazniova.entity.validator.MovieNameValidator;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Iryna_Seliazniova on 7/10/2017.
 */
public class MovieOrderBuilder {
    private static final AtomicInteger count = new AtomicInteger(0);
    MovieOrder movieOrder = new MovieOrder();

    public MovieOrderBuilder(String producer,String movieName, int numberOfEpisodes){
        movieOrder.setId(count.incrementAndGet());
        movieOrder.setProducer(producer);
        movieOrder.setNumberOfEpisodes(numberOfEpisodes);
        if (MovieNameValidator.ValidateMovieName(movieName)) {
            movieOrder.setMovieName(movieName);
        }
        else {
            movieOrder.setMovieName(movieOrder.getProducer()+'#'+movieOrder.getId());
        }
    }

    public MovieOrderBuilder addCrewMember(Crew crew) {
        movieOrder.getCrew().add(crew);
        movieOrder.addToPrice(crew.getCost());
        return this;
    }

    public MovieOrderBuilder addDevelopmentOperation(DevelopmentOperation developmentOperation) {
        movieOrder.getDevelopmentOperation().add(developmentOperation);
        movieOrder.addToPrice(developmentOperation.getCost());
        return this;
    }

    public MovieOrder build() {
        return movieOrder;
    }

    public double calculatePrice() {
        return movieOrder.getTotalPrice();
    }

}
