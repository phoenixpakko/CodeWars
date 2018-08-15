package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Write a program that will calculate the number of trailing zeros in a factorial of a given number.
        N! = 1 * 2 * 3 * ... * N

        Examples
        zeros(6) = 1
        # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero

        zeros(12) = 2
        # 12! = 479001600 --> 2 trailing zeros
        Hint: You're not meant to calculate the factorial. Find another way to find the number of zeros.
        */
        System.out.println(zeros(25));
        System.out.println(zeros(30));
        System.out.println(zeros(51));
        System.out.println(zeros(74));
        System.out.println(zeros(75));
        System.out.println(zeros(76));
        System.out.println(zeros(100));
    }

    public static int zeros(int n) {
        // your beatiful code here
        int result = 0;
        while (n > 5) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }

}
