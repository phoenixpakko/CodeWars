package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        You are given an array (which will have a length of at least 3, but could be very large) containing integers.
        The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
        Write a method that takes the array as an argument and returns this "outlier" N.

        Examples:
        [2, 4, 0, 100, 4, 11, 2602, 36]
        Should return: 11 (the only odd number)

        [160, 3, 1719, 19, 11, 13, -21]
        Should return: 160 (the only even number)
        */
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};

        System.out.println(find(exampleTest1));
        System.out.println(find(exampleTest2));
    }

    static int find(int[] integers) {

        boolean isEven = true;
        int Even_count = 0;
        int What_we_are_looking_for = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                Even_count += 1;
            }
        }

        if (Even_count > 1) {
            isEven = false;
        }

        for (int el : integers) {
            if (isEven) {
                if (el % 2 == 0) {
                    What_we_are_looking_for = el;
                    break;
                }
            } else {
                if (el % 2 != 0) {
                    What_we_are_looking_for = el;
                    break;
                }
            }
        }
        return What_we_are_looking_for;
    }
}
