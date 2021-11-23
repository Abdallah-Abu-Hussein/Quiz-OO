package com.company;

public class MovablePoint extends Point{
    private int xSpeed, ySpeed;
    public MovablePoint(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void Move(){


    }

    @Override
    public String toString() {
        return "("+super.getX()+","+super.getY()+")"+
                ")"+","+"Dimensions"+"["+xSpeed+","+ySpeed+"]";
    }
}
