package org.teachingkidsprogramming.section08events;

import java.util.Random;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  ProgramWindow programWindow;
  public SimpleBubble()
  {
    //    Create a ProgramWindow titled My Bubble --#1.1
    programWindow = new ProgramWindow("My Bubble");
    //    Uncomment the line below -- #1.2
    programWindow.setWindowVisible(true);
    //    Have programWindow listen for when the left mouse button is clicked in your program window --#2.2
    programWindow.addMouseLeftClickListener(this);
    //    prepareColorPalette (recipe below) --#7.1
    //
    prepareColorPalette();
  }
  private void prepareColorPalette()
  {
    //    ------------- Recipe for prepareColorPalette --#7.2
    //         Add purple to the color wheel --#2.3
    ColorWheel.addColor(PenColors.Purples.Purple);
    //         Add light steel blue to the color wheel --#4
    ColorWheel.addColor(PenColors.Blues.LightBlue);
    //         Add blue to the color wheel --#5
    ColorWheel.addColor(PenColors.Blues.Blue);
    //         Add dark blue to the color wheel --#6
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
    //    ------------- End of prepareColorPalette recipe --#7.3
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //     createBubble (recipe below) --#8.1
    createBubble(x, y);
  }
  private void createBubble(int x, int y)
  {
    //     Remove previous bubbles from your program window --#9
    programWindow.clearWindow();
    Random random = new Random();
    int radius = random.nextInt(42) + 10;
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    circle.setCenter(x, y);
    circle.addTo(programWindow);
    circle.addTo(programWindow);
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}