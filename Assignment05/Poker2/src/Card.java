/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Poker 2
 * Date: March 14, 2021
********************************************/

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card {
  /**
   * Sets the card's number - this coincides with the number of the image which will represent the card
   */
  private int cardNumber;

  /**
   * Card's face value
   */
  private String face;

  /***
   * Suit of the card
   */
  private String suit;

  /**
   * Numerical value of the card
   */
  private int value;

  /**
   * Sets the path to the image which will represent the card
   */
  private Image cardImage;

  /**
   * Sets the ImageView object that will finally be displayed
   */
  ImageView cardView;

  /**
   * Sets whether card is held
   */
  Boolean held;

  public Card(int cardNumber) {
    this.cardNumber = cardNumber;
    this.cardImage = new Image("img/" + this.cardNumber + ".png");
    this.cardView = new ImageView(this.cardImage);
    this.held = false;

    setSuit(this.cardNumber);
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

  public ImageView getCardView() {
    return cardView;
  }

  public void setCardView(ImageView cardView) {
    this.cardView = cardView;
  }

  public String getFace() {
    return face;
  }

  public void setFace(String face) {
    this.face = face;
  }

  public String getSuit() {
    return suit;
  }

  public void setSuit(int number) {
    if(number <= 13) {
      this.suit = "Spades";
    }else if(number > 13 && number <= 26) {
      this.suit = "Hearts";
    } else if(number > 26 && number <= 39) {
      this.suit = "Diamonds";
    } else if(number > 39 && number <= 52) {
      this.suit = "Clubs";
    } else if(number > 52) {
      this.suit = "Joker";
    }
  }

  public int getValue() {
    return value;
  }

  public void setValue(int cardNumber) {
    // this.value = value;
  }

  public Boolean getHeld() {
    return held;
  }

  public void setHeld(Boolean held) {
    this.held = held;
  }

  public void trade() {
    if(this.held != true) {
      
    }
  }
  
}
