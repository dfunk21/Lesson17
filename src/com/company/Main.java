package com.company;

public class Main {
//public in indexOf(char ch)
    public static void main(String[] args) {

        //What it does
            //Searches from left to right for first occurrence of the char "ch" in some String
            //Outputs index at which first occurrence appears

            //Accepts char "ch" and returns an int (the index value)

        String name = "Ferrari";
        int ch = name.indexOf('r');
        System.out.println(ch);

        //Searches through String "name" and returns index at which first occurrence of the char "r" appears
            //First occurrence is at index value 2

    }
}
