package org.example.java.basics;

public class LoopExamples {

    public static void main(String[] args) {

        int i = 10;

        // While loop
        while(i < 15){
            System.out.println("Print while");
            i++;
        }

        System.out.println("--------------------");
        int j = 10;

        // Do while loop
        do{
            j++;
            System.out.println("Print do-while");
        }while(j < 15);
        System.out.println("--------------------");
        // For loop
        for(int k = 0; k < 5; k++){
            System.out.println("Print for");
        }
        System.out.println("--------------------");
        // For each loop
        int[] array = {1,2,3,4,5};
        for(int m : array){
            System.out.println(m);
        }
    }
}
