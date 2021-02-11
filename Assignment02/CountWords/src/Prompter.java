/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Count the Words
 * Date: February 11, 2021
********************************************/

import java.util.Scanner;

/**
 * Handles the display of information to the user, including filenames, directory contents, commands, and program i/o
 */
public class Prompter {
  Scanner input = new Scanner(System.in);

  /**
   * Prompts user with given string
   * @param output  prints a prompt, surrounded by newlines, to the user
   */
  public void say(String output) {
    System.out.println("\n" + output + "\n");
  }
  
  /**
   * Prompts user with given string & awaits user input
   * @param output  sets prompt to be printed
   * @return string  user's response
   */
  public String ask(String output) {
    System.out.print(output + "");
    String response = clean(input.next());
    return response;
  }

  /**
   * Prompts user with given string & awaits user input
   * @param output  sets prompt to be printed
   * @param fullLine  sets whether full line response is expected from user
   * @return string  user's response
   */
  public String ask(String output, Boolean fullLine) {
    System.out.print(output + "");
    String response = input.nextLine();
    return response;
  }
  
  /**
   * Cleans up user input strings
   * @param userInput  sets the user's typed String input
   * @return string  returns the passed-in string in lower case and stripped of trailing/leading whitespace
   */
    public String clean(String userInput) {
      return userInput.toLowerCase().trim();
  }

  /**
   * Clears previous input from screen by printing lines of whitespace
   */
  public void clearScreen() {
    for(int i = 0; i < 30; i++) {
        System.out.println("");
    }
  }
}
