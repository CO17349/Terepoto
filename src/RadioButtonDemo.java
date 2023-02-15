import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends CheckBoxDemo{

    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
        paneForRadioButtons.setStyle("-fx-border-color: green; -fx-border-width: 2px");

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);

        pane.setLeft(paneForRadioButtons);

        // config radio buttons

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        rbRed.setOnAction(e -> {
            if (rbRed.isArmed()) {
                text.setFill(Color.RED);
            }
        });
        rbGreen.setOnAction(e -> {
            if (rbGreen.isArmed()) {
                text.setFill(Color.GREEN);
            }
        });
        rbBlue.setOnAction(e -> {
            if (rbBlue.isArmed()) {
                text.setFill(Color.BLUE);
            }
        });

        return pane;
    }
}