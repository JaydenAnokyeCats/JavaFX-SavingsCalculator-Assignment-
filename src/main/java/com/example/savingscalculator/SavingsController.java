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
        if ( itemName.getText().isEmpty() || costOfItem.getText().isEmpty() || numberOfMonths.getText().isEmpty() ){
            calculatedText.setText("Values haven't been filled out. Make sure to fill all values to get a " +
                    "calculation!");

        } else if (Double.parseDouble(numberOfMonths.getText()) == 0) {
            calculatedText.setText("You need to have a month amount greater then zero for a calculation.");
        } else{
            double number1 = Double.parseDouble(costOfItem.getText());
            double number2 = Double.parseDouble(numberOfMonths.getText());
            double finalAnswer = number1 / number2;
            calculatedText.setText("To buy a/an '" + itemName.getText() + "', you need to save $"
                    + finalAnswer + " per month!");
            calculatedText.setWrapText(true);


        }
    }

    @FXML
    protected void onResetButtonClick(){
        itemName.setText("");
        costOfItem.setText("");
        numberOfMonths.setText("");
    }
}