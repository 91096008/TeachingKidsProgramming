package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses3
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Nathan Ontiveros");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
    drawFlatRoof();
  }
  private static void drawHouse(int height)
  {
    Tortoise.move(150);
    Tortoise.turn(110);
    Tortoise.move(20);
    Tortoise.turn(70);
    Tortoise.move(145);
    Tortoise.setPenColor(Reds.Crimson);
    Tortoise.move(height);
    Tortoise.turn(45);
    Tortoise.move(5);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(2);
    Tortoise.turn(-90);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
