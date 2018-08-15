package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Задача 1. Есть некий текст. Необходимо заменить в этом тексте все слова "Nikolay" на "Oleg".
        Задача 2. Дан текст – «Сегодня мы с вами рассмотрели, как работать со строками в Си-шарп.
        Были описаны основные операторы и методы, которые используются для работы со строками». Обрежьте этот текст так, чтобы осталась только часть «Были описаны основные операторы и методы».
        Задача 3. Дана строка, которая содержит имена пользователей, разделенные запятой –
        "Login1,LOgin2,login3,loGin4". Необходимо разбить эту строку на массив строк (чтобы отдельно были логины), и перевести их все в нижний регистр.
        */

        /*
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        */
        /*String s = "Login1,LOgin2,login3,loGin4";
        s = s.toLowerCase();
        String[] array_of_str = s.split(",");
        for (String el:array_of_str)
            System.out.println(el);*/

        rowSumOddNumbers(1); // 1
        rowSumOddNumbers(2); // 3
        rowSumOddNumbers(8); // 57
        rowSumOddNumbers(9); // 73
        rowSumOddNumbers(142); // 74088

    }

    public static int rowSumOddNumbers(int n) {
        //TODO
        int sum = 0;
        int first_num_in_row = 1;

        // exception wrong number (negative or 0)
        if (n < 1) {
            System.out.println("Wrong argument!!!");
            return sum;  // sum can't be calculated, return 0
        }

        // n = 1
        if (n == 1) {
            System.out.println("Сума ел-тів ряду №" + n + " = " + "\t" + (sum + 1));
            return sum + 1; // in the first row sum = 1
        }

        // n > 1
        // calculate the first number in the line #n
        for (int i = 1; i < n; i++){
            first_num_in_row += 2 * i;
        }

        for (int i = 0; i < n; i ++ ){
            sum += first_num_in_row + i * 2;
        }

        System.out.println("Сума ел-тів ряду №" + n + " = " + "\t" + sum);
        return sum;

    }
}
