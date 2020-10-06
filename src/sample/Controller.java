package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea textArea1;
    @FXML
    public TextField textField1;

    public void clickButton(ActionEvent actionEvent) {
        textArea1.appendText(textField1.getText() + "/n");
        textField1.requestFocus();
        textField1.clear();
    }
}
