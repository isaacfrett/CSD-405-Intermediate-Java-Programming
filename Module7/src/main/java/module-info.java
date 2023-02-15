module com.example.module7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module7 to javafx.fxml;
    exports com.example.module7;
}