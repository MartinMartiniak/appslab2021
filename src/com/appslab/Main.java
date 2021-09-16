package com.appslab;

public class Main {

    public static void main(String[] args) {
        int a=2;
        int b=1;
        int c=0;
        int d=0;
        if (a==b){
            d=d+1;
        }
        else if (a!=b){
            d=d+0;
        }
        if (a==c){
            d=d+1;
        }
        else if (a!=c){
            d=d+0;
        }

        if (b==c){
            d=d+1;
        }
        else if (b!=c){
            d=d+0;
        }
        if (d==1){
            d=2;
        }
        System.out.println(d);
    }
}
