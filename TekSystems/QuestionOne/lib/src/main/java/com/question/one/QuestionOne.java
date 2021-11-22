package com.question.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * The Sieve of Eratosthenes is the earliest means of finding prime numbers.  A
 * description can be found at <a href="https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes">https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes</a>.
 * Write an implementation of this in Java.  The program should take a maximum integer value as an input,
 * and return the list of prime numbers between 0 and that number.  Provide unit tests.
 *
 */
public class QuestionOne {

    public static void main(String[] args) {
       run();
    }

    /***
     * Runs the command line program.
     */
    private static void run(){
        UserInput userInput = new UserInput();
        boolean cont = true;

        System.out.println("Welcome to the Prime Number Finder Program!\n");

        do {
            System.out.println("\nPlease enter in a max value to find all prime numbers up to: ");
            int maxValue = userInput.getNumber();

            System.out.println("Prime Numbers: " + listPrimeNumbers(maxValue));

            cont = userInput.getContinue("Do you wish to enter a new number? (Y/N)");

        }
        while (cont);

        System.out.println("\nThank for you using Prime Number Finder Program.  Enjoy the rest of your day.");
    }

    /***
     * Determine a list of valid prime numbers up to the given max integer value.
     *
     * @param maxValue Max number
     * @return a list of all prime numbers before the supplied max value
     */
    public static List<Integer> listPrimeNumbers(int maxValue){
        boolean[] listOfNumbers = new boolean[maxValue];

        //Initially set all values to true
        Arrays.fill(listOfNumbers, true);

        //Based off of the Sieve of Eratosthenes, sets values false
        //that are multiples of known prime numbers.
        for (int i = 2; i < listOfNumbers.length; i++){
            if (listOfNumbers[i]){
                for (int j = i * i; j < maxValue; j += i){
                    listOfNumbers[j] = false;
                }
            }
        }

        ArrayList<Integer> listPrimeNumbers = new ArrayList<>();

        //Adds to a new list the index's that have a value of true from
        //the original numbers list
        for (int i = 2; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i]){
                listPrimeNumbers.add(i);
            }
        }

        return listPrimeNumbers;
    }
}
