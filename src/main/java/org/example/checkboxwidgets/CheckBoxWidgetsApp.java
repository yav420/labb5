package org.example.checkboxwidgets;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckBoxWidgetsApp extends Application {

    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckBoxWidgets.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Checkbox Widgets");
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
