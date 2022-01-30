package org.example.java.io;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) throws IOException {
        usingScanner();
    }

    static  void usingBufferedReader() throws IOException {
        System.out.println("Enter a number : ");

        // InputStream

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();

        int actualNumber = Integer.parseInt(number);

        System.out.println("Input number is : " + actualNumber);
    }

    static void  usingScanner(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        System.out.println("Input number is : " + number);
    }

}
