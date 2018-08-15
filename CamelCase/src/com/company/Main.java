package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. All words must have their first letter capitalized without spaces.
        For instance:
        camelCase("hello case"); // => "HelloCase"
        camelCase("camel case word"); // => "CamelCaseWord"
        */
        camelCase("camel case method");
        camelCase(" camel case word");
        camelCase("say hello ");
        camelCase("z");
        camelCase("ab  c");
        camelCase("");
    }

    public static String camelCase(String str) {
        // your code here
        String dest = "";
        //String after = before.trim().replaceAll(" +", " ");
        String[] array_of_words = str.trim().replaceAll(" +"," ").split(" ");

        if (str.trim().compareTo("") == 0) {
            System.out.println("Empty string");
            return "";
        }

        for (String word : array_of_words) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            dest += word;
        }
        System.out.println(dest);
        return dest;
    }
}

