package com.appslab;

public class Main {

    public static void main(String[] args) {


        double length=0.2;
        double height=0.4;
        double towerHeight=100;
        double distance=(towerHeight/height)+(towerHeight/height)*length;
        System.out.println(distance);
        System.out.println(new Rooks().RookPositions("A","5", "D","5"));
        System.out.println(new Rooks().RookPositions("H","3", "H","4"));
        System.out.println(new Rooks().RookPositions("H","3", "C","1"));
    }
}
