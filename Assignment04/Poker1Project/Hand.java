/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Poker 1
 * Date: March 7, 2021
********************************************/

import java.util.ArrayList;
import javafx.scene.image.ImageView;

public class Hand {

  /**
   * Sets the list of Images in the hand
   */
  private ArrayList<ImageView> hand = new ArrayList<ImageView>();

  public Hand(){}

  public Hand(ArrayList<Integer> drawnCards) {
    setHand(drawnCards);
  }

  public ArrayList<ImageView> getHand() {
    return this.hand;
  }

  public void setHand(ArrayList<Integer> drawnCards) {
    // instantiate a new Card object for each integer returned
    // by the Deck's draw() method and add it to the hand list
    for(int i = 1; i < drawnCards.size(); i++) {
      Card card = new Card(drawnCards.get(i));
      this.hand.add(new ImageView(card.getCardImage()));
    }
  }
  
}
