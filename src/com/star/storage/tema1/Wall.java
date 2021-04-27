package com.star.storage.tema1;

public class Wall {
    private double width,height;
    Wall() {
        this.width = 0;
        this.height = 0;
    }
    Wall(double width,double height){
        this.width = ((width<0) ? 0 : width);
        this.height = ((height<0)?0: height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = ((width<0) ? 0 : width);
    }

    public void setHeight(double height) {
        this.height = ((height<0)?0: height);
    }
    public double getArea() {
        return height*width;
    }
}
