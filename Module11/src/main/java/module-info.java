module com.example.module11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module11 to javafx.fxml;
    exports com.example.module11;
}