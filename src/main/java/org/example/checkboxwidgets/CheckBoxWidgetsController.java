package org.example.checkboxwidgets;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CheckBoxWidgetsController {

    @FXML
    private CheckBox labelCheckBox;

    @FXML
    private CheckBox buttonCheckBox;

    @FXML
    private CheckBox textFieldCheckBox;

    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @FXML
    private void toggleTextField() {
        textField.setDisable(!textFieldCheckBox.isSelected());
    }

    @FXML
    private void toggleButton() {
        button.setDisable(!buttonCheckBox.isSelected());
    }

    @FXML
    private void toggleLabel() {
        label.setDisable(!labelCheckBox.isSelected());
    }
}
