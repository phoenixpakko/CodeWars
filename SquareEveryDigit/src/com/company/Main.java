package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Welcome. In this kata, you are asked to square every digit of a number.
        For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
        Note: The function accepts an integer and returns an integer
        */
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(158054));
        System.out.println(squareDigits(3062));
    }

    public static int squareDigits(int n) {
        // TODO Implement me
        String additional_str = "";
        int Ost_div, result;
        int NN = String.valueOf(n).length();
        for (int i = 1; i <= NN; i++) {
            Ost_div = n % 10;
            additional_str = (Ost_div * Ost_div) + additional_str;
            n /= 10;
        }

        return result = Integer.parseInt(additional_str);
    }
}
