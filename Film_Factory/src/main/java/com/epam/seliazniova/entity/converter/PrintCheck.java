package com.epam.seliazniova.entity.converter;

import com.epam.seliazniova.entity.entity.MovieOrder;

import java.text.NumberFormat;
import java.util.Collections;

/**
 * Created by Iryna_Seliazniova on 7/12/2017.
 */
public class PrintCheck {
    public static void printCheck(MovieOrder movieOrder){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.printf(
                String.join("", Collections.nCopies(30, "*"))+ '\n' +
                String.format("%30s","order: " + movieOrder.getId()) + '\n' +
                String.format("%30s","producer: " + movieOrder.getProducer()) + '\n' +
                String.format("%30s","movieName: " + movieOrder.getMovieName()) + '\n' +
                String.join("", Collections.nCopies(30, "-"))+ '\n' +
                ConvertArrayList.ArrayListToString(movieOrder.getCrew())+
                ConvertArrayList.ArrayListToString(movieOrder.getDevelopmentOperation())+ '\n'+
                String.join("", Collections.nCopies(30, "*")) + '\n' +
                String.format("%30s","totalPrice=" +formatter.format( movieOrder.getTotalPrice())) + '\n' +
                String.join("", Collections.nCopies(30, "*"))+'\n' +'\n'
        );
    }
}
