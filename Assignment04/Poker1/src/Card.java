/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Poker 1
 * Date: March 7, 2021
********************************************/

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card {
  /**
   * Sets the card's number - this coincides with the number of the image which will represent the card
   */
  private int cardNumber;

  /**
   * Sets the path to the image which will represent the card
   */
  private Image cardImage;

  /**
   * Sets the ImageView object that will finally be displayed
   */
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
