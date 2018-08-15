package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isTriangle(2, 5, 4);// true
        isTriangle(1, 2, 2);// true
        isTriangle(7, 2, 2);// false
    }
    public static boolean isTriangle(int a, int b, int c){
        if (a + b > c && a + c > b && b + c > a){
            System.out.printf("Трикутник зі сторонами %d, %d, та %d побудувати можливо", a, b, c);
            System.out.println();
            return true;
        }
        else {
            System.out.printf("Трикутник зі сторонами %d, %d, та %d побудувати НЕМОЖЛИВО!", a, b, c);
            System.out.println();
            return false;
        }
    }
}
