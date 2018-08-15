package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        In this kata, you must create a digital root function.
        A digital root is the recursive sum of all the digits in a number.
        Given n, take the sum of the digits of n. If that value has two digits, continue reducing in this way
        until a single-digit number is produced. This is only applicable to the natural numbers.
        For example:
        16 => 1 + 6 => 7,
        942 => 9 + 4 + 2 => 15 => 1 + 5 => 6
        */
        System.out.println(digital_root(16));       //7
        System.out.println(digital_root(942));      //6
        System.out.println(digital_root(16846));    //7
        System.out.println(digital_root(9846346));  //4
        System.out.println(digital_root(186345725));//5
    }

    public static int digital_root(int n) {
        if (n < 10){
            return n;
        }
        return digital_root((n % 10) + digital_root(n / 10));
    }

}
