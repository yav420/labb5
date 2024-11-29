package org.example.wordswapper;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class WordSwapperController {

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private Button swapButton;

    private boolean isLeftToRight = true;

    @FXML
    private void swapText() {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("WordSwapper.fxml"));

        if (isLeftToRight) {
            textField2.setText(textField1.getText());
            textField1.clear();
            swapButton.setText("←");
        } else {
            textField1.setText(textField2.getText());
            textField2.clear();
            swapButton.setText("→");
        }
        isLeftToRight = !isLeftToRight;
    }
}