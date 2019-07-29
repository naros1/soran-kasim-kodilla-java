package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){

        SecondChallange secondChallange = new SecondChallange();

        try{
            System.out.println(secondChallange.probablyIWillThrowException(1.5, 2.0));
        } catch (Exception e){
            System.out.println("Probably your numbers are not correct!!!");
        } finally {
            System.out.println("To finish with: \"Done!\" put false of : x >= 2 || x < 1 || y == 1.5");
        }
    }
}
