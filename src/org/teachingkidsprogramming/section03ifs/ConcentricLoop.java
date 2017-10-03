package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;

public class ConcentricLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(150);
    Tortoise.setY(200);
    Tortoise.setSpeed(10);
    for (int i = 0; i < 360; i++)
    {
      Tortoise.move(3);
      Tortoise.turn(1);
      //      If i is divisible by 20 --(HINT: Use mod operator '%') --#7
      //          Do the following 360 times --#8.1
      Tortoise.move(1);
      //              Turn the tortoise 1 degree --#6  
      Tortoise.turn(1);
      //              Change the width of the line that the tortoise draws to 1/100th of the current line --#9      
      //          End Repeat --#8.2
    }
  }
}