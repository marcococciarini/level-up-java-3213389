package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

  private static int startPoints = 10;
  private Scanner scanner = new Scanner(System.in);
  private Random rnd = new Random();
  private int currentPoints = startPoints;
  private boolean isStillPlaying = true;

  public void playGame() {
    // TODO: Implement method
    printWelcome();
    while ( isStillPlaying ){
      isStillPlaying = askUserToContinue();
      if (isStillPlaying){
        playTurn();
      }
    }
    printGoodbye();

  }

  private void printWelcome(){
    System.out.println("WELCOME TO ALL OR NOTHING GAME!!! LET'S START PLAYING");
  }

  private void printGoodbye() {
    System.out.println("GOODBYE!! GAME ENDED, SEE U NEXT TIME!");
  }

  private boolean askUserToContinue(){
    System.out.println("you currently have " + currentPoints + "points. do you want to try doubling (Y), or stop? (N)");
    String response = scanner.next();
    return response.toUpperCase().equals("Y");
  }

  private void playTurn(){
    if (rnd.nextBoolean()) {
      currentPoints *= 2;
      System.out.println("you have been lucky!! You just doubled your points, and you have " + currentPoints + " now.");
    }
    else {
      isStillPlaying = false;
      System.out.println("you have been unlucky!! You lost all your points :( !!");

    }

  }
}