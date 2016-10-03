package com.its.ex2;

import java.util.Random;

/**
 * Created by Alessio on 28/09/2016.
 */
public class Main {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random r = new Random(123);

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
        }

        avgWhile(array);
        avgFor(array);
        avgForeach(array);
        avgDowhile(array);

    }

    public static void avgWhile(int array[]) {
        int i = 0;
        double media = 0;
        while (i < array.length) {
            media = media + array[i];
            i++;
        }
        media = media / array.length;
        System.out.print("While: ");
        System.out.print(media);
    }

    public static void avgFor(int array[]) {
        double media = 0;

        for (int j = 0; j < array.length; j++) {
            media += array[j];
        }
        media = media / array.length;
        System.out.print(" For: ");
        System.out.print(media);
    }

    public static void avgForeach(int array[]) {
        double media = 0;
        double avg = 0;
        for (int k : array) {

            media += k;
            avg = media / array.length;
        }
        System.out.print("Foreach: ");
        System.out.print(avg);
    }

    public static void avgDowhile(int array[]) {
        int l = 0;
        float media = 0;
        do {
            media = media + array[l];
            l++;
        } while (l < array.length);
        media = media / array.length;
        System.out.print(" DoWhile: ");
        System.out.print(media);
    }

}
