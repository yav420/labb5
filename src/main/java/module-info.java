module org.example.wordswapper {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports org.example.checkboxwidgets to javafx.graphics;

    opens org.example.wordswapper to javafx.fxml;
    exports org.example.wordswapper;
}

