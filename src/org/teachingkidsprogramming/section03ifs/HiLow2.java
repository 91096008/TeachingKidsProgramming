package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow2
{
  // this variation tells user how many guesses they have left
  public static void main(String[] args)
  {
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    //int answer = (int) (Math.random() * 100 + 1);
    System.out.println("The answer is " + answer);
    //int answer = 11;
    for (int i = 0; i <= 8; i++)
    {
      MessageBox.showMessage("Please enter a valid guess between 1 and " + upperRange);
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
      MessageBox.showMessage("You" + " have" + "" + (8 - i) + " " + "" + "" + "Guesses left");
      if (i == 8)
        ;
    }
    MessageBox.showMessage("You lost");
    {
    }
  }
}
