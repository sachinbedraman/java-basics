package org.example.java.exception;

public class Example {

    public int addPositiveNumbers(int a, int b) throws CustomException {

        if(a < 0 || b < 0)
            throw  new CustomException("Numbers cannot be -ve");

        if(a == 0 || b== 0)
            throw  new CustomException("Numbers cannot be zero");

        return  a + b;
    }

    public  int addNumbers(int a, int b) throws CustomException{
        if(a < 0 || b < 0)
            throw  new NonNegativeException("Numbers cannot be -ve");

        if(a == 0 || b== 0)
            throw  new NonZeroException("Numbers cannot be zero");

        return  a + b;
    }
}
