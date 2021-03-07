/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Poker 1
 * Date: March 7, 2021
********************************************/

import java.util.ArrayList;
public class Deck {

  // list of cards in the deck
  private ArrayList<Integer> cardNumberList = new ArrayList<Integer>();

  // maximum number of cards in deck
  private int maxCards;

  public Deck(int maxCards) {
    this.maxCards = maxCards;

    // sets the number list to randomized list of integers
    this.cardNumberList = generateNumberList(maxCards);
  }

  public int getMaxCards() {
    return maxCards;
  }

  public void setMaxCards(int maxCards) {
    this.maxCards = maxCards;
  }
  
  public void setCardNumberList(int maxCards) {
    this.cardNumberList = generateNumberList(maxCards);
  }

  public ArrayList<Integer> getCardNumberList() {
    return this.cardNumberList;
  }

  // this is a public convenience method that calls the actual `generateNumberList()` randomizing method
  public ArrayList<Integer> shuffle() {
    this.cardNumberList = generateNumberList(this.maxCards);
    return this.cardNumberList;
  }

  /**
   * Generates unique random number
   * @param min  the minimum value of a random number
   * @param max  the maximum value of a random number
   * @return  the random number
   */
  private int getRand(int min, int max) {
    /**
     * Sets a preliminary random integer
     */
    int newNumber =  (int) ((Math.random() * (max - min)) + min);
    return newNumber;
  }

  // adds a new integer to cardNumberList - only if the list doesn't already have that integer
  private ArrayList<Integer> addToList(int number, ArrayList<Integer> cardNumberList) {
    if(!cardNumberList.contains(number)) {
      cardNumberList.add(number);
    }
    return cardNumberList;
  }

  /**
   * Generates a list of random numbers
   * @param maxValues  the maximum value of numbers to generate for the numberList
   * @return ArrayList<Integer>  list of integers, each one random
   */
  public ArrayList<Integer> generateNumberList(int maxValues) {
    ArrayList<Integer> numberList = new ArrayList<Integer>();

    // clear the numberList field if it is not empty
    if(numberList.size() > 0) {
      numberList.clear();
    }

    // using maxValues for the number of iterations
    // and for the max value of a random number
    // because, if we have a deck of `x` cards, we should only generate random numbers up to `x`
    for(int i = 0; i < maxValues; i++) {
        int newNumber = getRand(1, maxValues);
        numberList = addToList(newNumber, numberList);
    }

    return numberList;
  }

  // returns the first `x` number of cards from the cardNumberList
  public ArrayList<Integer> draw(int numberOfCards) {
    // list of cards to return
    ArrayList<Integer> drawnCards = new ArrayList<Integer>();
    
    for(int i = 0; i <= numberOfCards; i++) {
      drawnCards.add(this.cardNumberList.get(i));
    }
    
    return drawnCards;
  }
  
}
