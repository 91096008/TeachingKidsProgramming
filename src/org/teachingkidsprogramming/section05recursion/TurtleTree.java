package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    int length = 60;
    //
    drawBranch(length);
  }
  private static void drawBranch(int length)
  {
    if (length > 0)
    {
      adjustColor();
      Tortoise.move(length);
      Tortoise.turn(30);
      drawLowerBranches(length);
    }
  }
  private static void adjustColor()
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
  }
  private static void drawLowerBranches(int length)
  {
    drawShorterBranch(length);
    //
    Tortoise.turn(-60);
    drawShorterBranch(length);
    Tortoise.turn(30);
    adjustColor();
    Tortoise.move(-length);
  }
  private static void drawShorterBranch(int length)
  {
    drawBranch(length - 10);
  }
}