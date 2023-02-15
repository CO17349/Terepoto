import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class TextFieldDemo extends RadioButtonDemo{

    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a new message"));

        TextField txtMessage = new TextField();
        txtMessage.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextField.setCenter(txtMessage);
        pane.setTop(paneForTextField);

        txtMessage.setOnAction(e -> {
            text.setText(txtMessage.getText());
        });
        return pane;
    }
}