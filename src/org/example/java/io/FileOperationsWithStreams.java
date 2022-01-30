package org.example.java.io;


import java.io.*;

public class FileOperationsWithStreams {
    public static void main(String[] args) throws IOException {
        // writeToFile();
        readFromFile();
    }

    static void writeToFile() throws IOException {
        // /Users/sbedraman/source/ananya

        // Change this according to your system
        File file = new File("/Users/sbedraman/source/ananya/example_file.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        String fileContent = "Hello, This is Aravali Rangers !!!";

        fileOutputStream.write(fileContent.getBytes());

        // Flush any data that might be in the buffer
        fileOutputStream.flush();

        // Close the stream once we are done with writing
        fileOutputStream.close();
    }

    static void readFromFile() throws IOException {

        // Change this according to your system
        File file = new File("/Users/sbedraman/source/ananya/example_file.txt");

        FileInputStream fileInputStream = new FileInputStream(file);

        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

        System.out.println("File Contents " + reader.readLine());

        //byte[] input = new byte[100];

        //fileInputStream.read(input);

        fileInputStream.close();

        //System.out.println("File Contents : " +  new String(input));
    }

}
