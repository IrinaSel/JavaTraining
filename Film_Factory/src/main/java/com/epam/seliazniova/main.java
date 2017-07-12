package com.epam.seliazniova;

import com.epam.seliazniova.entity.MovieOrder;
import com.epam.seliazniova.builder.MovieOrderBuilder;
import com.epam.seliazniova.entity.MovieOrder;
import com.epam.seliazniova.enums.Crew;
import com.epam.seliazniova.enums.DevelopmentOperation;
import com.epam.seliazniova.converter.PrintCheck;

/**
 * Created by Iryna_Seliazniova on 7/10/2017.
 */
public class main {
       public static void main(String args[]){
           MovieOrder movieOrder = new MovieOrderBuilder("Quentin Tarantino","Pulp Fiction",1)
                   .addCrewMember(Crew.STAGEDIRECTOR)
                   .addDevelopmentOperation(DevelopmentOperation.EQUIPMENT)
                   .addCrewMember(Crew.ACTORS)
                   .build();
           System.out.println(movieOrder.toString());
           PrintCheck.printCheck(movieOrder);
           MovieOrder movieOrderSecond = new MovieOrderBuilder("Mihalkov","q",2)
                   .addCrewMember(Crew.MUSICIAN)
                   .addDevelopmentOperation(DevelopmentOperation.MONTAGE).addDevelopmentOperation(DevelopmentOperation.SCENARIO)
                   .addCrewMember(Crew.STAGEDIRECTOR)
                   .build();
           PrintCheck.printCheck(movieOrderSecond);
       }
    }

