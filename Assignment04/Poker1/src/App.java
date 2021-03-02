import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;


public class App {

    public static Deck deck = new Deck(52);

    // ArrayList<ImageView> hand = new ArrayList<ImageView>();

    // public ArrayList<ImageView> shuffle() {
    //     ArrayList<Integer> randCardList = shuffler.generateNumberList(5);

    //     ArrayList<Image> images = new ArrayList<Image>();

    //     if(hand.size() > 0) {
    //         hand.clear();
    //     }

    //     for(int i = 0; i < randCardList.size(); i++) {
    //         images.add(new Image("img/" + String.valueOf(randCardList.get(i)) + ".png"));
    //         hand.add(new ImageView(images.get(i)));
    //     }

    //     return hand;
    // }

    // @Override
    // public void start(Stage primaryStage) {
        // ArrayList<ImageView> hand = shuffle();

        // Button shuffleButton = new Button("Shuffle");

        // GridPane pane = new GridPane();
        // pane.setHgap(10);
        // pane.setVgap(20);

        // ColumnConstraints seventyTwo = new ColumnConstraints(72);
        // pane.getColumnConstraints().addAll(seventyTwo, seventyTwo, seventyTwo, seventyTwo, seventyTwo);
        // pane.setAlignment(Pos.CENTER);

        // for(int i = 0; i < hand.size(); i++) {
        //     pane.add(hand.get(i), i, 0, 1, 1);
        // }

        // pane.add(shuffleButton, 2, 1, 1, 1);
        
        // // pane.getChildren().add(windowButton);

        // shuffleButton.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent event) {
        //         shuffle();

        //         pane.getChildren().removeAll();
        //         for(int i = 0; i < hand.size(); i++) {
        //             pane.add(hand.get(i), i, 0, 1, 1);
        //         }
        //     }
        // });

        // Scene scene = new Scene(pane, 430, 186);
        // primaryStage.setTitle("First JavaFX");
        // primaryStage.setScene(scene);
        // primaryStage.show();
    }
    public static void main(String[] args) throws Exception {
        // Application.launch(args);
        System.out.println(deck.getMaxCards());
    }
}
