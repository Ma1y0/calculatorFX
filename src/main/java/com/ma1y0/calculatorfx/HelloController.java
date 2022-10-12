package com.ma1y0.calculatorfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextField num1TextBox;
    @FXML
    private TextField num2TextBox;
    @FXML
    private TextField ansTextBox;
    @FXML
    private ComboBox operatorCombo;
    @FXML
    private Button computeBtn;

    public void onCompute(ActionEvent event) {
        double num1 = 0;
        double num2 = 0;
        String operator = (String) operatorCombo.getSelectionModel().getSelectedItem();

        try {
            num1 = Double.parseDouble(num1TextBox.getText());
        } catch (Exception e) {

        }
        try {
            num2 = Double.parseDouble(num2TextBox.getText());
        } catch (Exception e) {

        }

        try {
            switch (operator) {
                case "+":
                    ansTextBox.setText(String.valueOf(num1 + num2));
                    break;
                case "-":
                    ansTextBox.setText(String.valueOf(num1 - num2));
                    break;
                case "*":
                    ansTextBox.setText(String.valueOf(num1 * num2));
                    break;
                case "/":
                    ansTextBox.setText(String.valueOf(num1 / num2));
                    break;
                case "√":
                    num2TextBox.setDisable(true);
                    num2TextBox.setText("");
                    ansTextBox.setText((String.valueOf(Math.sqrt(num1))));
                    break;
                case "**":
                    num1 = Double.parseDouble(num1TextBox.getText());
                    ansTextBox.setText((String.valueOf(Math.pow(num1, num2))));
            }
        } catch (Exception e) {

        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> operators = FXCollections.observableArrayList("+", "-", "*", "/", "**", "√");
        operatorCombo.setItems(operators);
    }
}