package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        // Initial values for loop
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            // Modulo note: Divided with both 3 and also with 5
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count == 5) {
                // Explicitly terminate the loop
                break;
            }
        }
        // Print accumulated sum
        System.out.println("Sum = " + sum);
    }
}
