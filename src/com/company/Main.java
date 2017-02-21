package com.company;

public class Main {

    public static void main(String[] args) {

        // create new array
        int[] numbers = new int[20];

        // fill array with number between 10 and 100
        functions.array_fill_random(numbers, 90, 10);

        // print the array
        System.out.println("The elements of the array:");
        functions.array_print(numbers);

        // search for the min value in the array
        System.out.println("The smallest number: " + functions.array_min(numbers));

        // we need 5 numbers between 1-50 and 2 between 1-10
        int[] winnersOne = new int[5];
        int[] winnersTwo = new int[2];

        functions.array_fill_random(winnersOne, 50, 1);
        functions.array_fill_random(winnersTwo, 10, 1);

        System.out.println("Winner numbers between 1 and 50:");
        functions.array_print(winnersOne);

        System.out.println("Winner numbers between 1 and 10:");
        functions.array_print(winnersTwo);
    }
}
