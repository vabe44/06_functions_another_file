package com.company;

import java.util.Random;

/**
 * Created by GTX on 20/02/2017.
 */
public class functions {

    static void array_fill_random(int[] arr, int range, int offset) {
        int i;
        Random r = new Random();
        for (i=0;i<arr.length;i++) {
            arr[i] = r.nextInt(range) + offset;
        }
    }

    static void array_print(int[] arr) {
        int i;
        for (i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    static int array_min(int[] arr) {
        int i;
        int min = arr[0];
        for (i=0;i<arr.length;i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
}
