package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }
    public static void main(String args[]) {

//        FileReader fileReader = new FileReader();
//        fileReader.readFile();

        FirstChallenge firstChallenge = new FirstChallenge();

        double result= 0;

        try {
            result = firstChallenge.divide( 3, 5 );
        } catch (ArithmeticException e) {
            System.out.println( "You can`t divide by 0, please put `b` again" );
        } finally {
            System.out.println( result );
        }
    }
}

