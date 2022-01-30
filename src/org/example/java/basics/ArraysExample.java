package org.example.java.basics;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array_1 = new int[10];

        int[] array_2 = new int[]{1, 2, 3, 4, 5};

        int[] array_3 = {1, 2, 3, 4, 5, 6};

        System.out.println("Size of array_3 = " + array_3.length);
        System.out.println("array_3[3] = " + array_3[3]);
        array_3[3] = 500;
        System.out.println("modified array_3[3] = " + array_3[3]);
    }
}
