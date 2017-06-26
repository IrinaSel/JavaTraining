package com.epam.seliazniova.objectCreator;
import com.epam.seliazniova.entity.Point;
import com.epam.seliazniova.entity.Tetrahedron;
import com.epam.seliazniova.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Iryna_Seliazniova on 6/26/2017.
 */
public class ObjectCreator {
    final  static Logger LOG = LogManager.getLogger();

    public static Point createPoint(Double[] coordinates){
        return new Point(coordinates[0],coordinates[1],coordinates[2]);
    }

    public static Tetrahedron createTetrahedron(Double[] coordinates){
        ArrayList<Point> pointArray = new ArrayList<Point>();
        if (Validator.validateNumberOfCoordinates(coordinates)) {
            pointArray.add(com.epam.seliazniova.objectCreator.ObjectCreator.createPoint(Arrays.copyOfRange(coordinates, 0, 3)));
            pointArray.add(com.epam.seliazniova.objectCreator.ObjectCreator.createPoint(Arrays.copyOfRange(coordinates, 3, 6)));
            pointArray.add(com.epam.seliazniova.objectCreator.ObjectCreator.createPoint(Arrays.copyOfRange(coordinates, 6, 9)));
            pointArray.add(com.epam.seliazniova.objectCreator.ObjectCreator.createPoint(Arrays.copyOfRange(coordinates, 9, 12)));
        }
        else{
            LOG.info("Can't create Tetrahedron: wrong coordinates ");
            return null;
        }
        if(Validator.validateIsTetrahedron(pointArray)){
            return new Tetrahedron(pointArray);
        }
        else {
            LOG.info("Can't create Tetrahedron: wrong coordinates ");
            return null;
        }
    }
}
