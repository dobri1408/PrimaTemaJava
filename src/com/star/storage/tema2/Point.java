package com.star.storage.tema2;

public class Point {
    private int x,y;
    Point() {
        x= 0 ;
        y=  0;
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public  double distance() {
        return Math.sqrt(x*x+y*y);
    }
    public double distance(Point a) {
        return Math.sqrt((x-a.getX()) *(x-a.getX()) + (y-a.getY())*(y-a.getY()));
    }
}
