/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Poker 2
 * Date: March 14, 2021
********************************************/

import java.util.ArrayList;
import javafx.scene.image.ImageView;

public class Hand {

  /**
   * Sets the list of Cards in the hand
   */
  private ArrayList<Card> hand = new ArrayList<Card>();

  /**
   * Sets the cards that the user wants to hold
   */
  private ArrayList<Card> heldCards = new ArrayList<Card>();


  public Hand(){}

  public Hand(ArrayList<Integer> drawnCards) {
    setHand(drawnCards);
  }

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  public void setHand(ArrayList<Integer> drawnCards) {
    // instantiate a new Card object for each integer returned
    // by the Deck's draw() method and add it to the hand list
    for(int i = 1; i < drawnCards.size(); i++) {
      Card card = new Card(drawnCards.get(i));
      this.hand.add(card);
    }
  }

  public void tradeHand(ArrayList<Card> currentCards) {
    currentCards.forEach((card) -> {
      if(!card.held) {
        card = new Card()
      }
    });
  }
  
}
