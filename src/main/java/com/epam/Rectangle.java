package com.epam;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle(int width, int length) {

        this.width = width;
        this.length = length;
    }

    public int getPerimeter(){
        if (length <= 0 || width <= 0 ){
            throw new RuntimeException("Rectangle's sides can't be negative or zero");
        }
        return (width+length)*2;
    }

    public double getDiagonal(){
        if (length <= 0 || width <= 0 ){
            throw new RuntimeException("Rectangle's sides can't be negative or zero");
        }
        return Math.sqrt(width*width + length*length);
    }
}


