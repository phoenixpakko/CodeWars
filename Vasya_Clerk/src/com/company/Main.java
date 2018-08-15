package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Tickets(new int[]{25, 25, 50})); // Yes
        System.out.println(Tickets(new int[]{25, 100})); // No
        System.out.println(Tickets(new int[]{25, 50, 25, 25, 50, 50, 25, 25, 25, 50, 100, 100, 100}));
        System.out.println(Tickets(new int[]{25, 50, 25, 25, 50, 50, 25, 25, 25, 50, 100, 100}));
        System.out.println(Tickets(new int[]{25, 50, 25, 25, 50, 50, 25, 25, 25, 50, 100, 50, 25, 50, 100}));
        System.out.println(Tickets(new int[]{25, 50, 25, 25, 50, 50, 25, 25, 25, 25, 25, 100, 50, 25, 25, 50, 100}));
        System.out.println(Tickets(new int[]{25, 50, 25, 25, 25, 100, 50}));
    }

    public static String Tickets(int[] peopleInLine) {
        //Your code is here...
        int bill_25_count = 0, bill_50_count = 0;

        for (int bill : peopleInLine) {

            switch (bill) {
                case 25:
                    bill_25_count++; // Count of 25$ bill increases on 1 in the till
                    // No need a change
                    break;
                case 50:
                    bill_50_count++;
                    if (bill_25_count >= 1) {
                        bill_25_count -= 1;
                        break;
                    }
                    return "NO";
                case 100:
                    if (bill_25_count >= 1 && bill_50_count >= 1) {
                        bill_25_count -= 1;
                        bill_50_count -= 1;
                        break;
                    }
                    if (bill_25_count > 2) {
                        bill_25_count -= 3;
                        break;
                    }
                    return "NO";
            }
        }
        return "YES";
    }
}
