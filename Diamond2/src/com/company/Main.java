package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(print(9));
        System.out.println(print(15));
        System.out.println(print(45));
        System.out.println(print(6));
        System.out.println(print(-61));
    }

    public static String print(int n) {
        if (n < 0 || n % 2 == 0) return null;
        String shape = "";

        int midRow = n/2 + 1;

        for (int i = midRow; i <= n*2 - midRow; i++) {
            for (int j = 1; j <= n - Math.abs(n - i); j++) {
                if (j <= Math.abs(n - i))
                    shape += " ";
                else
                    shape += "*";
            }
            shape += "\n";
        }
        return shape;
    }
}
