import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ButtonDemo extends Application {

    protected Text text = new Text(50, 50, "JavaFX Programming");
    protected BorderPane getPane() {
        HBox paneForButtons = new HBox(20);
        Button btnLeft = new Button("Left", new ImageView("images/logo.png"));
        Button btnRight = new Button("Right", new ImageView("images/selector.png"));
        paneForButtons.getChildren().addAll(btnLeft, btnRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);

        btnLeft.setOnAction((e -> text.setX(text.getX() - 10)));
        btnRight.setOnAction((e -> text.setX(text.getX() + 10)));
        return pane;
    }

    @Override
    public void start(Stage stage) {

        Scene scene = new Scene(getPane(), 450, 200);
        stage.setTitle("Button Demo");
        stage.setScene(scene);
        stage.show();
    }
}