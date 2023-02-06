module com.example.module8 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.module8 to javafx.fxml;
    exports com.example.module8;
}