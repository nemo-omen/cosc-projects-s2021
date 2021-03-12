/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Poker 2
 * Date: March 14, 2021
********************************************/



import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;


public class App extends Application{
    // this project is split into three functioning classes:
    // 1. The deck, which holds the list of numbers for each card and also implements a shuffle() method that randomizes that list
    // 2. the Hand, which is essentially a list of the first `x` cards taken from an instantiated Deck object
    // 3. The Card, holds a reference to the Image/ImageView for final display to client

    // instantiate a deck of 54 cards (include the jokers)
    public static Deck deck = new Deck(54);

    // draw the first 5 cards from the deck and instantiate a hand with them
    public static Hand hand = new Hand(deck.draw(5));

    @Override
    public void start(Stage primaryStage) {

        // most of the following simply sets up the objects we'll use to display output to the client
        
        // sets the cards in the hand
        ArrayList<Card> cards = hand.getHand();

        // button that sends the shuffle event
        Button shuffleButton = new Button("Shuffle");
        
        // create pane to set the window divisions (1 Hbox, 1 Vbox)
        GridPane pane = new GridPane();
        
        // create a new scene and add the pane to it
        Scene scene = new Scene(pane);

        // this is the section where all cards and HOLD buttons will be displayed
        HBox cardBox = new HBox();

        // this section only holds the shuffle button
        VBox buttonBox = new VBox();

        // create some ColumnConstraints so they match the window width
        // and can be used when setting up our panes
        // ColumnConstraints fullWidth = new ColumnConstraints(600);

        //add Card and hold Buttons to cardBox
        cardBox.getChildren().addAll(buildCards(cards));

        // set some padding and alignment for Hbox and Vbox 
        cardBox.setPadding(new Insets(20,20,20,20));
        cardBox.setSpacing(20);
        cardBox.setAlignment(Pos.CENTER);

        buttonBox.setAlignment(Pos.CENTER);

        // add button to the Vbox
        buttonBox.getChildren().add(shuffleButton);

        // set alignment, and background color (a very exciting gray!)
        pane.setPadding(new Insets(20,20,20,20));
        pane.setAlignment(Pos.CENTER);
        pane.setBackground(new Background(new BackgroundFill(Color.web("#bababa"), CornerRadii.EMPTY, Insets.EMPTY)));

        // add Hbox and Vbox to the pane
        pane.add(cardBox, 0, 0, 1, 1);
        pane.add(buttonBox, 0, 2, 1, 1);

        // set the window title
        primaryStage.setTitle("Shuffler");

        // add the scene, along with everything that is now attached to it
        primaryStage.setScene(scene);

        // on with the show!
        primaryStage.show();

        // events

        // shuffle button listener
        shuffleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                // call the shuffle method
                deck.shuffle();

                // instantiate new Hand object with the return of the Deck.draw() method
                hand = new Hand(deck.draw(5));

                // create an ArrayList of Card objects
                ArrayList<Card> newCards = hand.getHand();
                
                // clear previous ImageView objects from the Hbox
                cardBox.getChildren().clear();

                // add the new ones
                cardBox.getChildren().addAll(buildCards(newCards));

            }
        });
    }

    public static ArrayList<VBox> buildCards(ArrayList<Card> allCards) {

        ArrayList<VBox> allCardBoxes = new ArrayList<VBox>();

        //create a new VBox forEach card
        allCards.forEach((card) -> {
            VBox cardVbox = new VBox();
            Button holdButton = new Button("HOLD");
            String thisSuit = card.getSuit();
            
            holdButton.setOnAction((ActionEvent event) -> {
                System.out.println(thisSuit);
                if(holdButton.getText().equals("HOLD")) {
                    holdButton.setText("X");
                    card.setHeld(true);
                } else {
                    holdButton.setText("HOLD");
                    card.setHeld(false);
                }
                System.out.println("Held: " + card.getHeld());
            });
            
            cardVbox.setSpacing(20);
            cardVbox.setAlignment(Pos.CENTER);
            
            cardVbox.getChildren().add(card.getCardView());
            cardVbox.getChildren().add(holdButton);
            
            allCardBoxes.add(cardVbox);
        });

        return allCardBoxes;
    }

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
    
}
