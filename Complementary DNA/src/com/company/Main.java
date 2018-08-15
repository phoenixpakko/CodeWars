package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
        You have function with one side of the DNA (string, except for Haskell);
        you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
        */
        System.out.println(makeComplement("AAAA"));
        System.out.println(makeComplement("ATTGC"));

    }

    public static String makeComplement(String dna) {
        //Your code
        String compl_dna = "";
        char[] dna_flow = dna.toCharArray();
        for (char ch : dna_flow) {
            switch (ch) {
            case 'A':
                compl_dna += "T";
                continue;
            case 'T':
                compl_dna += "A";
                continue;
            case 'C':
                compl_dna += "G";
                continue;
            case 'G':
                compl_dna += "C";
                continue;
            default:
                continue;
            }

        }

        return compl_dna;
    }
}
