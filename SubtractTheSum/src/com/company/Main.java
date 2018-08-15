package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Complete the function which get an input number n such that n >= 10 and n < 10000, then:

        Sum all the digits of n.
        Subtract the sum from n, and it is your new n.
        If the new n is in the list below return the associated fruit, otherwise return back to task 1.
        Example
        n = 325
        sum = 3+2+5 = 10
        n = 325-10 = 315 (not in the list)
        sum = 3+1+5 = 9
        n = 315-9 = 306 (not in the list)
        sum = 3+0+6 = 9
        n =306-9 = 297 (not in the list)
        .
        .
        .
        ...until you find the first n in the list below.
        */

        System.out.println(subtractSum(810));
        System.out.println(subtractSum(81565));
        System.out.println(subtractSum(546));
        System.out.println(subtractSum(226));
        System.out.println(subtractSum(57));
        System.out.println(subtractSum(22));
        System.out.println(subtractSum(10));
        System.out.println(subtractSum(11));
        System.out.println(subtractSum(12));
        System.out.println(subtractSum(13));
    }

    public static String subtractSum (int n) {
        //return fruit name like "apple"
        String[] List_of_fruits = {"kiwi","pear","kiwi","banana","melon","banana","melon","pineapple","apple","pineapple",
                "cucumber","pineapple","cucumber","orange","grape","orange","grape","apple","grape","cherry",
                "pear","cherry","pear","kiwi","banana","kiwi","apple","melon","banana","melon",
                "pineapple","melon","pineapple","cucumber","orange","apple","orange","grape","orange","grape",
                "cherry","pear","cherry","pear","apple","pear","kiwi","banana","kiwi","banana",
                "melon","pineapple","melon","apple","cucumber","pineapple","cucumber","orange","cucumber","orange",
                "grape","cherry","apple","cherry","pear","cherry","pear","kiwi","pear","kiwi",
                "banana","apple","banana","melon","pineapple","melon","pineapple","cucumber","pineapple","cucumber",
                "apple","grape","orange","grape","cherry","grape","cherry","pear","cherry","apple",
                "kiwi","banana","kiwi","banana","melon","banana","melon","pineapple","apple","pineapple"};
        return List_of_fruits[counter_recursive(n)-1];
    }

    public static int counter_recursive(int n) {
        if (n <= 100) {
            return n - sumDigits(n);
        }
         return counter_recursive(n -sumDigits(n));
        }

    public static int sumDigits(int i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }
}
