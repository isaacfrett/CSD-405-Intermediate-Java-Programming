package com.example.module8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;


public class CardApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Random 4 Cards");
        Button button = new Button("Refresh");


        Image card1 = getRandomCards();
        Image card2 = getRandomCards();
        Image card3 = getRandomCards();
        Image card4 = getRandomCards();

        ImageView imageView1 = new ImageView(card1);
        ImageView imageView2 = new ImageView(card2);
        ImageView imageView3 = new ImageView(card3);
        ImageView imageView4 = new ImageView(card4);

        // On click we change the 4 images used previously
        button.setOnAction((actionEvent) -> {
            imageView1.setImage(getRandomCards());
            imageView2.setImage(getRandomCards());
            imageView3.setImage(getRandomCards());
            imageView4.setImage(getRandomCards());
        });

        HBox hBox = new HBox();
        BorderPane bp = new BorderPane();
        bp.setCenter(hBox);

        // setup our view
        hBox.getChildren().add(imageView1);
        hBox.getChildren().add(imageView2);
        hBox.getChildren().add(imageView3);
        hBox.getChildren().add(imageView4);
        bp.setBottom(button);

        Scene scene = new Scene(bp, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static Image getRandomCards() {
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



