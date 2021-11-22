package com.question.one;

import java.util.Scanner;

public class UserInput {

    private final Scanner scanner;

    public UserInput() {
        this(new Scanner(System.in));
    }

    protected UserInput(Scanner scanner){
        this.scanner = scanner;
    }

    public int getNumber(){
        return scanner.nextInt();
    }

    public boolean getContinue(String message){
      boolean validInput = false;
      String userInput = "";

      System.out.println(message);

      do {
          userInput = scanner.next();

          if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")){
              validInput = true;
          } else {
              System.out.println("Error! Incorrect entry. Please enter either Y (Yes) or N (No).  \nPlease try again: ");
          }
      }
      while (!validInput);

      return userInput.equalsIgnoreCase("y");
    }
}
