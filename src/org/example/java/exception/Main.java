package org.example.java.exception;

import javax.xml.transform.sax.SAXSource;
import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        // Compile time exceptions

        try{
            foo(3);
            System.out.println("after method");
        }catch (IOException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Finally called");
        }

        // Runtime Exception

        System.out.println("Length " + (1/0));

        String s = null;
        System.out.println("Length " + s.length());
    }

    private static void foo(int i) throws IOException, SQLException, ClassNotFoundException, NullPointerException {

        if (i == 0)
            System.out.println("Method called");
        else if (i == 1)
            throw new IOException("I == 1");
        else if(i == 2)
            throw new SQLException("i == 2");
        else
            throw  new ClassNotFoundException();
    }
}
