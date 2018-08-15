package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        You need to return a string that displays a diamond shape on the screen using asterisk ("*") characters. Please see provided test cases for exact output format.
        The shape that will be returned from print method resembles a diamond, where the number provided as input represents the number of *’s printed on the middle line.
        The line above and below will be centered and will have 2 less *’s than the middle line. This reduction by 2 *’s for each line continues until a line with
        a single * is printed at the top and bottom of the figure.
        Return null if input is even number or negative (as it is not possible to print diamond with even number or negative number).
        */
        System.out.println(print(9));
        System.out.println(print(15));
        System.out.println(print(45));
        System.out.println(print(6));
        System.out.println(print(-61));
    }

    public static String print(int n) {
        // TODO your code here
        StringBuilder output_str = new StringBuilder();
        String out = "";

        if (n % 2 == 0 || n < 0) {
            return null;
        }

        for (int j = 0; j < n/2 + 1; j++) {
            for (int i = 0; i < Math.abs(n / 2 - j); i++) {
                output_str.append(" ");
            }

            for (int i = 0; i < n - Math.abs(n - j * 2) + 1; i++) {
                output_str.append("*");
            }
            output_str.append("\n");
        }

        for (int j = n/2 + 1; j < n; j++) {
            for (int i = 0; i < Math.abs(n / 2 - j); i++) {
                output_str.append(" ");
            }

            for (int i = 0; i < n - Math.abs(n - (j+1) * 2) + 1; i++) {
                output_str.append("*");
            }
            output_str.append("\n");
        }

        out = output_str.toString();
        return out;
    }
}
