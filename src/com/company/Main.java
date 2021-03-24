package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        Scanner console = new Scanner(System.in);
        int arrSize = 10;

        int userInput = console.nextInt();

        //index + mod
        int[] arrA = getFilledArray(arrSize, userInput, Integer::sum);
        System.out.println("A: " + Arrays.toString(arrA));

        //index * mod
        int[] arrB = getFilledArray(arrSize, userInput, (index, mod) -> index * mod);
        System.out.println("B: " + Arrays.toString(arrB));

        /*
         * for even index: (index / 2) + mod
         * for odd index:  (index * 2) - mod
         */
        int[] arrC = getFilledArray(arrSize, userInput, (index, mod) -> {
            if (index % 2 == 0) {
                return index / 2 + mod;
            } else {
                return (int) Math.pow(index, 2) - mod;
            }
        });
        System.out.println("C: " + Arrays.toString(arrC));

        //mod - index
        int[] arrD = getFilledArray(arrSize, userInput, ((index, mod) -> mod - index));
        System.out.println("D: " + Arrays.toString(arrD));

        //index + (mod * 2)
        int[] arrE = getFilledArray(arrSize, userInput, ((index, mod) -> index + (mod * 2)));
        System.out.println("E: " + Arrays.toString(arrE));

        console.close();
    }

    public static int[] getFilledArray(final int arrSize, final int userInput, final Process p) {
        int[] filledArr = new int[arrSize];
        for (int i = 0; i < filledArr.length; i++) {
            filledArr[i] = p.process(i, userInput);
        }
        return filledArr;
    }
}