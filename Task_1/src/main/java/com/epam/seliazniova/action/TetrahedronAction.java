package com.epam.seliazniova.action;
import com.epam.seliazniova.entity.*;
import static java.lang.Math.*;
/**
 * Created by Iryna_Seliazniova on 6/13/2017.
 */
public class TetrahedronAction {
    public double tetrahedronVolume(Tetrahedron tetrahedron){
        PointAction pointAction = new PointAction();
        double sideLenght = pointAction.pointDistance(tetrahedron.getPoint1(),tetrahedron.getPoint2());
        double volume = pow(sideLenght,3)*sqrt(2)/12;
        return volume;
    }

}
