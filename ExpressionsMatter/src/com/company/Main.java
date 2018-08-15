package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ().

        Consider an Example: With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
        1 * (2 + 3) = 5
        1 * 2 * 3 = 6
        1 + 2 * 3 = 7
        (1 + 2) * 3 = 9
        So the maximum value that you can obtain is 9.

        Notes
        The numbers are always positive.
        The numbers are in the range (1  ≤  a, b, c  ≤  10).
        You can use the same operation more than once.
        It's not necessary to place all the signs and brackets.
        Repetition in numbers may occur .
        You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.
        */
        System.out.println(expressionsMatter((2),(10),(3)));//60
        System.out.println(expressionsMatter((1),(8),(3)));//27
        System.out.println(expressionsMatter((9),(7),(2)));//126
        System.out.println(expressionsMatter((10),(5),(6)));//300

    }

    public static int expressionsMatter(int a, int b, int c) {
        int max_result = 0;
        max_result = a + b + c;
        if (a + b  * c  > max_result) {max_result =  a + b  * c;}
        if (a * b  * c  > max_result) {max_result =  a * b  * c;}
        if (a * b  + c  > max_result) {max_result =  a * b  + c;}
        if ((a + b) * c > max_result) {max_result = (a + b) * c;}
        if (a * (b + c) > max_result) {max_result =  a * (b + c);}

        return max_result;
    }

}
