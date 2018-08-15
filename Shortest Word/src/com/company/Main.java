package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Simple, given a string of words, return the length of the shortest word(s).
        String will never be empty and you do not need to account for different data types.
        */
        findShort("bitcoin take over the world maybe who knows perhaps");// 3
        findShort("turns out random to test cases are easier than writing out basic ones"); // 3
    }
    public static int findShort(String s) {
        int Shortest_word_length;
        String[] Array_of_words = s.split(" ");

        // If string does not contain any word - return 0 length
        if (Array_of_words.length == 0){
            return 0;
        }

        Shortest_word_length = Array_of_words[0].length();
        for (String el: Array_of_words){
            if (el.length() < Shortest_word_length) {
                Shortest_word_length = el.length();
            }
        }
        return Shortest_word_length;
    }
}
