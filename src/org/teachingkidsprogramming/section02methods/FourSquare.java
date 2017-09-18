package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#7
    //  Do the following 4 times --#8.1
    //      drawSquare (recipe below) --#6.1
    //      ------------- Recipe for drawSquare --#6.2
    //      Do the following 4 times --#5.1
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(50);
    //          Turn the tortoise 90 degrees to the right --#4
    Tortoise.turn(90);
    //      End Repeat --#5.2
    //      ------------- End of drawSquare recipe --#6.3
    //      Turn the tortoise 90 degrees to the right --#9
    //  End Repeat --#8.2
  }
}
