package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses2
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Ntahan Ontiveros");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(Reds.Crimson);
    Tortoise.move(height);
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawflatroof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
