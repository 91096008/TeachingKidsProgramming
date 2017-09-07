package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Nathan O.");
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 80;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Greens.MediumSpringGreen);
      int length = i;
      Tortoise.move(length);
      Tortoise.turn(4000 / sides);
      Tortoise.setPenWidth(i);
    }
    //  End Repeat --#5.2
    //
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}
