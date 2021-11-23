package com.company;

public class Main {

    public static void main(String[] args) {
        Point newPoint = new Point(5,7);
        Rectangle myReact = new Rectangle(newPoint,8,5);
        System.out.println(myReact.getRightCorner());

    }
}
