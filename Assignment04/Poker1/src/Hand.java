import java.util.ArrayList;
import javafx.scene.image.ImageView;

public class Hand {
  private ArrayList<ImageView> hand = new ArrayList<ImageView>();

  public Hand(){}

  public Hand(ArrayList<Integer> drawnCards) {
    setHand(drawnCards);
  }

  public ArrayList<ImageView> getHand() {
    return this.hand;
  }

  public void setHand(ArrayList<Integer> drawnCards) {
    
    for(int i = 1; i < drawnCards.size(); i++) {
      Card card = new Card(drawnCards.get(i));
      this.hand.add(new ImageView(card.getCardImage()));
    }
  }
  
}
