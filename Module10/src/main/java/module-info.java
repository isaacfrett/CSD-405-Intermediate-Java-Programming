module com.example.module10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module10 to javafx.fxml;
    exports com.example.module10;
}