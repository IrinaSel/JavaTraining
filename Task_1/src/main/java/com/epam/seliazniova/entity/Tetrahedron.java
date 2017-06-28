package com.epam.seliazniova.entity;
import com.epam.seliazniova.entity.Point;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Iryna_Seliazniova on 6/13/2017.
 */
public class Tetrahedron {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Tetrahedron(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Tetrahedron(ArrayList<Point> pointArray) {
        this.point1 = pointArray.get(0);
        this.point2 = pointArray.get(1);
        this.point3 = pointArray.get(2);
        this.point4 = pointArray.get(3);
    }


    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() { return point4; }

    @Override
    public boolean equals(Object obj){
        if (obj==this) {
            return true;
        }
        if (obj==null || !(obj instanceof Tetrahedron)) {
            return false;
        }
        Tetrahedron tetrahedron = (Tetrahedron) obj;
        return point1.equals(tetrahedron.getPoint1())
                && point2.equals(tetrahedron.getPoint2())
                && point3.equals(tetrahedron.getPoint3())
                && point4.equals(tetrahedron.getPoint4());
    }

    public int hashCode() {
        return Objects.hash(point1,point2,point3,point4);
    }
}


