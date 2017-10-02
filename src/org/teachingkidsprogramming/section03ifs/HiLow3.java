package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow3
{
  public static void main(String[] args)
  {
    int answer = (int) (Math.random() * 100 + 1);
    System.out.println("The answer is " + answer);
    //int answer = 11;
    System.out.println("The answer is " + answer);
    int upperRange = 100;
    for (int i = 0; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      while (guess < 1 || guess > 100)
      {
        MessageBox.showMessage("Please enter a valid guess between 1 and " + upperRange);
        guess = MessageBox.askForNumericalInput("What is your guess?");
      }
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
      if (i == 8)
        ;
    }
    MessageBox.showMessage("You lost");
    {
    }
  }
}
