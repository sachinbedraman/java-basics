package org.example.java.basics;

public class ControlStatements {

    public static void main(String[] args) {

        int i = 11;

        if(i <= 10){
            System.out.println("i is smaller than 10");
        } else if (i > 10 && i <= 20){
            System.out.println("i is greater than 10 but smaller than 20");
        } else {
            System.out.println("i is greater than 20");
        }

        System.out.println("--------------------------------------");

        int j = 20;
        switch (j){
            case 10 :
                System.out.println("Value is 10");
                break;
            case 20 :
                System.out.println("Value is 20");
                break;
            default:
                System.out.println("No match available");
        }

    }

}
