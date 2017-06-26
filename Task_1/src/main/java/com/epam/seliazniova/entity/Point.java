package com.epam.seliazniova.entity;

/**
 * Created by Iryna_Seliazniova on 6/12/2017.
 */
public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object obj){
        if (obj==this) return true;
        if (obj==null || obj.getClass()!=this.getClass()) return false;
        return (this.x==((Point) obj).x && this.y ==((Point) obj).y && this.z ==((Point) obj).z);
    }
}
