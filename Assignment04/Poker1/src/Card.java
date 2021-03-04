import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card {
  private int cardNumber;
  private Image cardImage;
  ImageView cardView;

  public Card(int cardNumber) {
    this.cardNumber = cardNumber;
    this.cardImage = new Image("img/" + this.cardNumber + ".png");
    this.cardView = new ImageView(this.cardImage);
  }

  public int getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(int cardNumber) {
    this.cardNumber = cardNumber;
  }

  public Image getCardImage() {
    return cardImage;
  }

  public void setCardImage(Image cardImage) {
    this.cardImage = cardImage;
  }
  
}
