package com.company;

public class Rectangle {
    private Point corner;
    private int width,length;

    public Rectangle(Point corner, int width, int length) {
        this.corner = corner;
        this.width = width;
        this.length = length;
    }

    public Point getRightCorner(){
        Point MyPoint = new Point();
        corner.setX(MyPoint.getX()+this.length);
        corner.setY(MyPoint.getY()+this.width);
        return corner;
    }
    public void Operation1(){};
    public Point getCorner() {
        return corner;
    }

    public void setCorner(Point corner) {
        this.corner = corner;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "("+corner.getX()+","+corner.getX()+
                ")"+","+"Dimensions"+"["+width+","+length+"]";
    }
}
