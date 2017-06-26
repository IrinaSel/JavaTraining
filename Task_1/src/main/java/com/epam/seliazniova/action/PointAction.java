package com.epam.seliazniova.action;
import static java.lang.Math.*;

import com.epam.seliazniova.entity.Point;
/**
 * Created by Iryna_Seliazniova on 6/13/2017.
 */
public class PointAction {
    public static double pointDistance(Point point1, Point point2){
        double distance = sqrt(pow(point1.getX()-point2.getX(),2)
                          +pow(point1.getY()-point2.getY(),2)
                          +pow(point1.getZ()-point2.getZ(),2));
        return distance;
    }
}
