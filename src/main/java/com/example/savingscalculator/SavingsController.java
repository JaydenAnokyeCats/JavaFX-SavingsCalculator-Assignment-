package com.example.savingscalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Objects;

public class SavingsController {
    @FXML
    private Label calculatedText;
    @FXML
    private TextField itemName;
    @FXML
    private TextField costOfItem;
    @FXML
    private TextField numberOfMonths;



    @FXML
    protected void onCalculateButtonClick() {
        double number1 = Double.parseDouble(costOfItem.getText());
        double number2 = Double.parseDouble(numberOfMonths.getText());
        double finalAnswer = number1 / number2;
        if ( costOfItem.getText().isEmpty() || numberOfMonths.getText().isEmpty() ){
            calculatedText.setText("A value hasn't been filled out. Make sure to fill all values to get a" +
                    "calculation!");

        } else{
            calculatedText.setText("To buy a/an '" + itemName.getText() + "', you need to save $"
                    + finalAnswer + " per month!");

        }


    }
}