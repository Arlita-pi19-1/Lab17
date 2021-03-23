package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField FirstNum;

    @FXML
    TextField SecondNum;

    @FXML
    TextField Sum;

    @FXML
    Label Error;

    @FXML

    public void click(javafx.event.ActionEvent actionEvent) {
        try {
            double a = Double.parseDouble(FirstNum.getText());
            double b = Double.parseDouble(SecondNum.getText());
            Sum.setText(String.valueOf(a + b));
        } catch (Exception e) {
            Error.setText("Error in field");
        }
    }

    @FXML
    public void click2(javafx.event.ActionEvent actionEvent) {
        try {
            FirstNum.setText(null);
            SecondNum.setText(null);
            Sum.setText(null);
            Error.setText(null);
        } catch (Exception e) {
            Error.setText("Error in field");

        }
    }
}
