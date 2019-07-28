package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        }catch (ArithmeticException e){

            System.out.println("Oh no ! You probbably trying to devide by 0, dummy ;)! Error: " + e);

        } finally {
            System.out.println(" Try - catch - finally! Always working to take care of you!!");
        }



    }
}
