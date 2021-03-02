import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button windowButton = new Button("Open New Window");

        windowButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("It Works!!");
            }
        });

        StackPane pane = new StackPane();
        pane.getChildren().add(windowButton);

        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setTitle("First JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
