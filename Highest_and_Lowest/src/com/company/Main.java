package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
        Example:
        HighAndLow("1 2 3 4 5") // return "5 1"
        HighAndLow("1 2 -3 4 5") // return "5 -3"
        HighAndLow("1 9 3 4 -5") // return "9 -5"
        Notes:
        All numbers are valid Int32, no need to validate them.
        There will always be at least one number in the input string.
        Output string must be two numbers separated by a single space, and highest number is first.
        */
        System.out.println("\"" + HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4") + "\"");

        //HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
    }

    public static String HighAndLow(String numbers) {
        // Code here or
        String[] splitted_numbers = numbers.split(" ");
        int Max_value = Integer.parseInt(splitted_numbers[0]),
            Min_value = Integer.parseInt(splitted_numbers[0]);
        for (String el : splitted_numbers) {
            if (Integer.parseInt(el) > Max_value) {
                Max_value = Integer.parseInt(el);
            }
            else if (Integer.parseInt(el) < Min_value) {
                Min_value = Integer.parseInt(el);
            }
        }

        return Max_value + " " + Min_value;

    }

}
