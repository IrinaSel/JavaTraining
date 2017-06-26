package com.epam.seliazniova.creator;
import com.epam.seliazniova.entity.Point;
import com.epam.seliazniova.entity.Tetrahedron;
import com.epam.seliazniova.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Iryna_Seliazniova on 6/26/2017.
 */
public class ObjectCreator {
    final  static Logger LOG = LogManager.getLogger();


    @Nullable
    public static Point createPoint(Double[] coordinates){
        if (Validator.validateNumberOfCoordinates(coordinates,3)){
            return new Point(coordinates[0],coordinates[1],coordinates[2]);
        }
        else {
            LOG.info("Can't create Point: wrong number of coordinates ");
            return null;
        }
    }
    @Nullable
    public static Tetrahedron createTetrahedron(Double[] coordinates){
        ArrayList<Point> pointArray = new ArrayList<Point>();
        if (Validator.validateNumberOfCoordinates(coordinates,12)) {
            pointArray.add(com.epam.seliazniova.creator.ObjectCreator.createPoint(Arrays.copyOfRange(coordinates, 0, 3)));
            pointArray.add(com.epam.seliazniova.creator.ObjectCreator.createPoint(Arrays.copyOfRange(coordinates, 3, 6)));
            pointArray.add(com.epam.seliazniova.creator.ObjectCreator.createPoint(Arrays.copyOfRange(coordinates, 6, 9)));
            pointArray.add(com.epam.seliazniova.creator.ObjectCreator.createPoint(Arrays.copyOfRange(coordinates, 9, 12)));
        }
        else{
            LOG.warn("Can't create Tetrahedron: wrong coordinates. Returned value is null");
            return null;
        }
        if(Validator.validateIsTetrahedron(pointArray)){
            return new Tetrahedron(pointArray);
        }
        else {
            LOG.warn("Can't create Tetrahedron: wrong coordinates. Returned value is null");
            return null;
        }
    }
}
