package com.epam.seliazniova.entity.validator;

/**
 * Created by Iryna_Seliazniova on 7/11/2017.
 */
public class MovieNameValidator {
    public static boolean ValidateMovieName(String movieName){
        return (movieName.length()<=20 && movieName.length()>=3);
    }
}
