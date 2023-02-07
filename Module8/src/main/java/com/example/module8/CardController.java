package com.example.module8;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.FileNotFoundException;

public class CardController {
    @FXML
    private Label buttonText;

    @FXML
    protected void onButtonClick() throws FileNotFoundException {
        buttonText.setText("Your 4 Random Cards Are");
    }


}