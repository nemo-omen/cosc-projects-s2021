import java.util.ArrayList;
public class Deck {

  private ArrayList<Integer> cardNumberList = new ArrayList<Integer>();
  private int maxCards;

  public Deck(int maxCards) {
    this.maxCards = maxCards;
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

  private ArrayList<Integer> addToList(int number, ArrayList<Integer> cardNumberList) {
    if(!cardNumberList.contains(number)) {
      cardNumberList.add(number);
    }
    return cardNumberList;
  }

  /**
   * Generates a list of random numbers
   * @param maxValues
   */
  public ArrayList<Integer> generateNumberList(int maxValues) {
    ArrayList<Integer> numberList = new ArrayList<Integer>();

    // clear the numberList field if it is not empty
    if(numberList.size() > 0) {
      numberList.clear();
    }

    for(int i = 0; i < maxValues; i++) {
        int newNumber = getRand(1, maxValues);
        numberList = addToList(newNumber, numberList);
    }

    return numberList;
  }

  public ArrayList<Integer> draw(int numberOfCards) {
    ArrayList<Integer> drawnCards = new ArrayList<Integer>();
    
    for(int i = 0; i <= numberOfCards; i++) {
      drawnCards.add(this.cardNumberList.get(i));
    }
    
    return drawnCards;
  }
  
}
