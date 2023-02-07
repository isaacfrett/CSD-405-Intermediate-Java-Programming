package com.example.module8;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CardApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // set title
            primaryStage.setTitle("JavaFX ImageView Tutorial - tutorialkart.com");

            //read image as stream
            FileInputStream input = new FileInputStream("18.png");
            //prepare image object
            Image image = new Image(input);
            //create ImageView object
            ImageView imageView = new ImageView(image);

            // stack pane
            TilePane tilePane = new TilePane();

            // add ImageView to the tile pane
            tilePane.getChildren().add(imageView);

            //set up scene
            Scene scene = new Scene(tilePane, 450, 300);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }



    public static void getRandomCards() throws FileNotFoundException {


        for (int i = 0; i < 4; i++) {
            int image_number = (int) (Math.random() * 52) + 1;
        }




    }
}



