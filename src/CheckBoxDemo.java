import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class CheckBoxDemo extends ButtonDemo {

    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        // create font styles
        Font fntNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);
        Font fntBold = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
        Font fntItalic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fntBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);

        // default text to normal font
        text.setFont(fntNormal);

        // VBox for checkboxes
        VBox paneForCheckBoxes = new VBox(20);
        paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
        paneForCheckBoxes.setStyle("-fx-border-color: green");
        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkItalic = new CheckBox("Italic");

        paneForCheckBoxes.getChildren().addAll(chkItalic, chkBold);
        pane.setRight(paneForCheckBoxes);

        EventHandler<ActionEvent> handler = e -> {
            if (chkBold.isSelected() && chkItalic.isSelected()) {
                text.setFont(fntBoldItalic);
            }
            else if (chkBold.isSelected()) {
                text.setFont(fntBold);
            }
            else if (chkItalic.isSelected()) {
                text.setFont(fntItalic);
            }
            else {
                text.setFont(fntNormal);
            }
        };

        chkItalic.setOnAction(handler);
        chkBold.setOnAction(handler);

        return pane;
    }
}