package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibsVaritaion
{
  public static void main(String[] ars)
  {
    String adverb = askAdverb();
    String edverb = askEdverb();
  }//end of main
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("INVALID INPUT! ENTER AN ADVERB!");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are NOT adverbs, try again!");
      askAdverb();
    }
    return adverb;
  }//end of method
  private static String askEdverb()
  {
    String edVerb = MessageBox.askForTextInput("Enter a verb ending in -ed");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Don't like verbs? You need one now.");
      askEdverb();
    }
    edVerb = MessageBox.askForTextInput("Enter a body part");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("INVALID INPUT! ENTER A BODY PART!");
      askEdverb();
    }
    else if (edVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are NOT adverbs, try again!");
      askEdverb();
    }
    return edVerb;
  }
  String currentStory = askAdverb() + askEdverb();
}// end of class