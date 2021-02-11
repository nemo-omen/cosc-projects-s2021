/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Minecraft Blocks
 * Date: February 3, 2021
********************************************/

import java.util.Scanner;
public class Test {
  public static Scanner input = new Scanner(System.in);

  // "global" variables

    /**
   * Asks whether player would like to mine some sand
   */
  public static String digQuestion = "\n\nWould you like to mine some sand?  (Y/N)";

  /**
   * Asks whether player has a shovel
   */
  public static String shovelQuestion = "\n\nDo you have a shovel?  (Y/N)";

  /**
   * exit phrase on negative answers
   */
  public static String negativeGoodbye = "\n\nMaybe a little swimming instead! Enjoy your time at Minecraft Beach!";

  /**
   * exit phrase on positive answers
   */
  public static String positiveGoodbye = "\n\nThanks for visiting Minecraft Beach!! Enjoy your sand!";


  /**
   * simple horizontal rule string for emphasis
   */
  public static String breakLine = "\n\n*******************************************************\n";
  public static void main(String[] args) throws Exception {
      /**
       * New sand object
       */
      Sand sandBlock = new Sand();

      System.out.println(sandBlock.toString());
      
      System.out.println("\n\nWelcome to Minecraft Beach!");
      System.out.println("\n\nYou're standing in front of a block of sand.");
      System.out.println("\n\nIt looks like there's enough to build a nice sand castle.");
      System.out.print(digQuestion);
      
      /**
       * whether player wants to proceed with mining
       */
      boolean shouldDig = decide(input.next(), digQuestion);

      if (shouldDig == false) {
        System.out.println(negativeGoodbye + breakLine);
      } else {
        System.out.print(shovelQuestion);

        /**
         * whether player can proceed with mining
         */
        boolean canDig = (decide(input.next(), shovelQuestion));

        if(canDig == false) {
          System.out.println("\n\nYou're going to need a shovel if you want to mine sand!");
          System.out.println(negativeGoodbye + breakLine);
        } else {
          mine(sandBlock);
        }
      }
  }

  /**
   * mines the given block
   * @param  block
   */

  static void mine(Sand sand) {
    /**
     * sets local value of block's hardness
     */
    int currentHardness = sand.getHardness();
    
    System.out.println(breakLine + "\nThe sand makes a pleasant sound as your shovel digs in.\n" + breakLine);
    
    sand.setHardness(currentHardness - 1);

    /**
     * sets local variable based on return of sand.isDestroyed()
     */
    String diggingResult = sand.isDestroyed();


    if(sand.getHardness() <= 0) {
      // mining's done
      System.out.println("\nGreat work! You are now the proud owner of some " + diggingResult);
      //say goodbye
      System.out.println(breakLine + positiveGoodbye + breakLine);
    } else {
      // let user know block is not destroyed
      System.out.println("\n\nThis sand seems to be a little harder than average.");

      /**
       * question to ask user for more than one mining attempt
       */
      String digAgainQuestion = "\n\nDo you want to keep digging?  (Y/N) ";

      System.out.print(digAgainQuestion);

      /**
       * return of digAgainQuestion
       */
      boolean willDigAgain = decide(input.next(), digAgainQuestion);
      
      if(willDigAgain == true) {
        // mine again
        mine(sand);
      } else {
        System.out.println(breakLine + negativeGoodbye);
      }
    }
    
  }

  /**
   * Handles Y/N answers
   * @param reply  sets the string to use for diciding a return value
   * @param question  the question to ask if the reply does not meet usable criteria
   * @return boolean  whether to proceed based on handled answer
   */
  public static boolean decide(String reply, String question) {

    /**
     * user input, set to lowerCase and trimmed of trailing/leading whitespace
     */
    String answer = reply.trim().toLowerCase();

    /**
     * value based on parsed user input
     */
    boolean decision = false;

    if(!answer.equals("y") && !answer.equals("n") && !answer.equals("yes") && !answer.equals("no")) {
      // answer is no good.
      System.out.println("Y/N only please.");
      // prompt again
      System.out.println(question);
      //handle response
      decide(input.next(), question);
    } else if(answer.equals("n") || answer.equals("no")) {
      decision = false;
    } else if(answer.equals("y") || answer.equals("yes")){
      decision = true;
    }
    return decision;
  }
}