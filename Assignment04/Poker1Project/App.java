/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Poker 1
 * Date: March 7, 2021
********************************************/

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;
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

    public static Deck deck = new Deck(54);

    public static Hand hand = new Hand(deck.draw(5));

    @Override
    public void start(Stage primaryStage) {

        // most of the following simply sets up the objects we'll use to display output to the client
        
        // sets the images that will be displayed to the client
        ArrayList<ImageView> images = hand.getHand();

        // button that sends the shuffle event
        Button shuffleButton = new Button("Shuffle");

        
        // create pane to set the window divisions (1 Hbox, 1 Vbox)
        GridPane pane = new GridPane();
        
        // create a new scene and add the pane to it
        Scene scene = new Scene(pane, 480, 186);

        // this is the section where all cards will be displayed
        HBox cardBox = new HBox(20);

        // this section only holds the shuffle button
        VBox buttonBox = new VBox();

        // create some ColumnConstraints so they match the window width
        // and can be used when setting up our panes
        ColumnConstraints fullWidth = new ColumnConstraints(480);

        // set some padding and alignment for Hbox and Vbox 
        cardBox.setPadding(new Insets(20,20,20,20));
        cardBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(0,20,20,20));
        buttonBox.setAlignment(Pos.CENTER);

        // add button to the Vbox
        buttonBox.getChildren().add(shuffleButton);

        // set ColumnConstraints, alignment, and background color (a very exciting gray!)
        pane.getColumnConstraints().addAll(fullWidth);
        pane.setAlignment(Pos.CENTER);
        pane.setBackground(new Background(new BackgroundFill(Color.web("#bababa"), CornerRadii.EMPTY, Insets.EMPTY)));

        // add the card images to the Hbox
        cardBox.getChildren().addAll(images);

        // add Hbox and Vbox to the pane
        pane.add(cardBox, 0, 0, 1, 1);
        pane.add(buttonBox, 0, 1, 1, 1);

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
                
                // create an ArrayList of the ImageView objects we'll display to client
                ArrayList<ImageView> newImages = hand.getHand();
                
                // clear previous ImageView objects from the Hbox
                cardBox.getChildren().clear();

                // add the new ones
                cardBox.getChildren().addAll(newImages);

            }
        });
    }

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
    
}
