package com.epam.seliazniova.validator;
import com.epam.seliazniova.entity.Point;
import com.epam.seliazniova.action.PointAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Created by Iryna_Seliazniova on 6/18/2017.
 */
public class Validator {
    //log true-false
    final  static Logger LOG = LogManager.getLogger();

    public static boolean validateFormatOfString(String string) {
        String cleanString = string.replaceAll("[ ,.-]", "");
        if(Pattern.matches("^-?\\d+$",cleanString)) {
            return true;
        }
        else {
            LOG.info("String format is invalid");
            return false;
        }

    }
    public static boolean validateNumberOfCoordinates(Double[] coordinates, int numberOfCoordinates) {
        if(coordinates.length== numberOfCoordinates) {
            return true;
        }
        else {
            LOG.info("Wrong number of coordinates");
            return false;
        }

    }
    public static boolean validateIsTetrahedron(ArrayList<Point> pointArray) {
     double compareValue = PointAction.pointDistance(pointArray.get(0),pointArray.get(1));
     for (int i = 0; i < pointArray.size(); i++) {
         for (int j = i+1 ; j < pointArray.size(); j++) {
            if(compareValue!=PointAction.pointDistance(pointArray.get(i),pointArray.get(j))){
                LOG.info("Can't create tetrahedron from these coordinates");
                return false;
            }
         }
     }
     return true;


    }




    }
//validateTet

