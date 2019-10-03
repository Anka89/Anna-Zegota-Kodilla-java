package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "";
        try {
           result = secondChallenge.probablyIWillThrowException( 1.3, 1.7 );
        } catch (Exception e) {
            System.out.println( "Try again :D" );
        } finally {
            System.out.println(result);
        }
    }
}
