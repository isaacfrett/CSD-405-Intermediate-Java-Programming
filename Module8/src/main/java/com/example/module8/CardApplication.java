package com.example.module8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.*;


public class CardApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Random 4 Cards");

        Image card1 = getRandomCards(primaryStage);
        Image card2 = getRandomCards(primaryStage);
        Image card3 = getRandomCards(primaryStage);
        Image card4 = getRandomCards(primaryStage);


        ImageView imageView1 = new ImageView(card1);
        ImageView imageView2 = new ImageView(card2);
        ImageView imageView3 = new ImageView(card3);
        ImageView imageView4 = new ImageView(card4);
        TilePane tilePane = new TilePane();

        tilePane.getChildren().add(imageView1);
        tilePane.getChildren().add(imageView2);
        tilePane.getChildren().add(imageView3);
        tilePane.getChildren().add(imageView4);

        Scene scene = new Scene(tilePane, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static Image getRandomCards(Stage primaryStage) {

        try {
            int image_number = (int) (Math.random() * 52) + 1;
            File input = new File("src/cards/" + image_number + ".png");
            Image image = new Image(input.toURI().toString());
            return image;

        } catch(Exception e) {
            e.printStackTrace();
        }


        return null;
    }
}



