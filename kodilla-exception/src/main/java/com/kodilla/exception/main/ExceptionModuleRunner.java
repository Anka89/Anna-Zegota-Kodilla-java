package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.FirstChallenge;

public class ExceptionModuleRunner {
    public static void main(String args[]) {

//        FileReader fileReader = new FileReader();
//        fileReader.readFile();

        FirstChallenge firstChallenge = new FirstChallenge();

        double result= 0;

        try {
            result = firstChallenge.divide( 3, 0 );
        } catch (ArithmeticException e) {
            System.out.println( "You can`t divide by 0, please put `b` again" );
        } finally {
            System.out.println( result );
        }
    }
}
