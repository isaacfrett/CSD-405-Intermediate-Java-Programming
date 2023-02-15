package com.example.module7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Example extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

//       Setup gridpane to hold both hbox and vbox
        GridPane gp = new GridPane();


//        Create our hbox with three elements
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        hbox.getChildren().addAll(button1, button2, button3);

//        Create vbox with three elements
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");
        vbox.getChildren().addAll(button4, button5, button6);

//        Added boxes to gridpane
        gp.add(hbox, 100, 500);
        gp.setHgap(1);
        gp.add(vbox, 200,0);

//        Set scene with the gridpane
        Scene scene = new Scene(gp, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

}