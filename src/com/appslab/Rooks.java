package com.appslab;

public class Rooks {
    public String RookPositions (String rook1pos1, String rook1pos2, String rook2pos1, String rook2pos2){
        int b= 0;
        if (rook1pos1==rook2pos1){
             b= 1;
        }
        else if (rook1pos2==rook2pos2){
             b= 1;
        }
        if (b==1){
            System.out.println("True");
        }
        else if (b!=1){
            System.out.println("false");
        }

    }
}
//if Rook1pos1/Rook2pos2=Rook2pos1/Rook2pos2 = true//