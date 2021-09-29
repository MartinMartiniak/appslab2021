package com.appslab;

public class Main {

    public static void main(String[] args) {

        String word = "radar";
        StringBuffer buffer = new StringBuffer(word);
        buffer.reverse();
        String data = buffer.toString();
        if(word.equals(data)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is not palindrome");
        }
    }
}