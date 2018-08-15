package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getCount("abracaalghsiurwpvxcnbdkfvbkdfaapoeiwquiuicxvdabra"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        char[] Full_array = str.toCharArray();
        for (char el : Full_array) {
            switch(el){

                case 'a':
                    vowelsCount += 1;
                    continue;
                case 'e':
                    vowelsCount += 1;
                    continue;
                case 'i':
                    vowelsCount += 1;
                    continue;
                case 'o':
                    vowelsCount += 1;
                    continue;
                case 'u':
                    vowelsCount += 1;
                    continue;
                default:
                    continue;
            }
        }
        return vowelsCount;
    }
}
