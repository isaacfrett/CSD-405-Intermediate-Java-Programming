package com.example.module11;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.util.Random;



// Isaac Frett
// 3/1/2023
// Module 11 Programming Assignment
// The Purpose of this assignment is to create a GUI that displays shapes when toggling buttons
// the shapes will have the ability to change colors based on a checkbox


public class Module11 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // setup stage
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(primary());
        stage.setWidth(700);
        stage.setHeight(600);
        stage.show();
    }

    // main scene

    public static Scene primary() {

        // radio buttons and add to group

        final ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Circle");
        rb1.setToggleGroup(group);
        RadioButton rb2 = new RadioButton("Rectangle");
        rb2.setToggleGroup(group);
        RadioButton rb3 = new RadioButton("Ellipse");
        rb3.setToggleGroup(group);

        // shapes

        Circle circle = new Circle(30, 30, 150);
        Rectangle rectangle = new Rectangle(60, 100, 200, 300);
        Ellipse ellipse = new Ellipse(10, 10, 100, 150);
        Group shape = new Group();

        // set toggle props of radio buttons to change shapes on click
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                if (group.getSelectedToggle() == rb1) {
                    shape.getChildren().remove(rectangle);
                    shape.getChildren().remove(ellipse);
                    shape.getChildren().add(circle);
                }
                if (group.getSelectedToggle() == rb2) {
                    shape.getChildren().remove(ellipse);
                    shape.getChildren().remove(circle);
                    shape.getChildren().add(rectangle);
                }
                if (group.getSelectedToggle() == rb3) {
                    shape.getChildren().remove(rectangle);
                    shape.getChildren().remove(circle);
                    shape.getChildren().add(ellipse);
                }
            }
        });

        // checkbox that toggles random color on click

        CheckBox cbx = new CheckBox("Random Color");
        cbx.selectedProperty().addListener((
                ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
            if (group.getSelectedToggle() == rb1) {
                circle.setFill(randomColor());
            }
            if (group.getSelectedToggle() == rb2) {
                rectangle.setFill(randomColor());
            }
            if (group.getSelectedToggle() == rb3) {
                ellipse.setFill(randomColor());
            }
        });

        // make our scene and position elements

        TilePane tp1 = new TilePane(rb1, rb2, rb3);
        tp1.setAlignment(Pos.CENTER);
        TilePane tp2 = new TilePane(shape);
        tp2.setAlignment(Pos.CENTER);
        TilePane tp3 = new TilePane(cbx);
        tp3.setAlignment(Pos.BOTTOM_CENTER);

        VBox vBox = new VBox(tp1, tp2, tp3);
        vBox.setSpacing(100);
        vBox.setPadding(new Insets(0, 20, 10, 20));
        Scene scene = new Scene(vBox);
        return scene;

    }

    // random color function

    public static Color randomColor() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        Color randomColor = Color.rgb(r, g, b);
        return randomColor;

    }

}
