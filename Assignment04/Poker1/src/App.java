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

    public static Deck deck = new Deck(54);
    public static Hand hand = new Hand(deck.draw(5));

    @Override
    public void start(Stage primaryStage) {
        
        ArrayList<ImageView> images = hand.getHand();

        Button shuffleButton = new Button("Shuffle");

        GridPane pane = new GridPane();

        HBox cardBox = new HBox(20);

        VBox buttonBox = new VBox();

        cardBox.setPadding(new Insets(20,20,20,20));
        cardBox.setAlignment(Pos.CENTER);
        
        buttonBox.setPadding(new Insets(0,20,20,20));
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().add(shuffleButton);

        ColumnConstraints fullWidth = new ColumnConstraints(480);
        pane.getColumnConstraints().addAll(fullWidth);
        pane.setAlignment(Pos.CENTER);
        pane.setBackground(new Background(new BackgroundFill(Color.web("#bababa"), CornerRadii.EMPTY, Insets.EMPTY)));

        cardBox.getChildren().addAll(images);

        pane.add(cardBox, 0, 0, 1, 1);
        pane.add(buttonBox, 0, 1, 1, 1);

        shuffleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                deck.shuffle();

                hand = new Hand(deck.draw(5));
                
                ArrayList<ImageView> newImages = hand.getHand();
                
                cardBox.getChildren().clear();

                cardBox.getChildren().addAll(newImages);

            }
        });

        Scene scene = new Scene(pane, 480, 186);
        primaryStage.setTitle("Shuffler");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
    
}
