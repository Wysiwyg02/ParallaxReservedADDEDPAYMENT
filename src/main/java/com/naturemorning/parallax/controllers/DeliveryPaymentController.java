/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naturemorning.parallax.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

@Controller
public class DeliveryPaymentController implements Initializable {

    @FXML
    private TextField cashier;

    @FXML
    private TextField age;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colAge;

    @FXML
    private TableColumn<?, ?> colAmount;

    @FXML
    private TableColumn<?, ?> colEdit;

    @FXML
    private TextField amount;

    @FXML
    private Button payment;

    @FXML
    private Button delete;

    @FXML
    private Button reset;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void payment(ActionEvent event) {

    }

    @FXML
    void reset(ActionEvent event) {

    }

}
