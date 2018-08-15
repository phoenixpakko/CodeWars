package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        You have to create a function that takes a positive integer number and returns the next bigger number formed by the same digits:

        Kata.nextBiggerNumber(12)==21
        Kata.nextBiggerNumber(513)==531
        Kata.nextBiggerNumber(2017)==2071
        If no bigger number can be composed using those digits, return -1:

        Kata.nextBiggerNumber(9)==-1
        Kata.nextBiggerNumber(111)==-1
        Kata.nextBiggerNumber(531)==-1
        */
        System.out.println(nextBiggerNumber(1234567980)); //
    }

    public static long nextBiggerNumber(long n) {
        boolean isChanged = false;
        int temp = 0;
        StringBuilder result_str = new StringBuilder();
        long result_long = 0;
        int[] digits = Long.toString(n).chars().map(c -> c-'0').toArray();

        // For one digit number - return "-1"
        if (n < 10) {
            return -1;
        }

        for(int i = digits.length - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]) {

                temp = digits[i];
                digits[i] = digits[i - 1];
                digits[i - 1] = temp;
                isChanged = true;
                break;
            }
        }

        if (isChanged) {
            for (int n1 : digits) {
                result_str.append(n1);
            }
            result_long = Long.valueOf(result_str.toString());
            return result_long;
        }
        else {
            return -1;
        }
    }


}
