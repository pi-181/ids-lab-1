package com.demkom58.ids_lab_1.client;

import com.demkom58.ids_lab_1.ICalc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Optional;

public class MainController {
    private static final String SERVICE_NAME = "rmi://localhost/CalcService";

    @FXML
    private TextField expressionInput;
    @FXML
    private Label resultLabel;

    @FXML
    public void onCalculate(ActionEvent event) {
        getService().ifPresent(service -> {
            try {
                final double result = service.calculate(expressionInput.getText());
                resultLabel.setText(expressionInput.getText() + " = " + result);
            } catch (RemoteException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            }
        });
    }

    private Optional<ICalc> getService() {
        try {
            return Optional.of((ICalc) Naming.lookup(SERVICE_NAME));
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Не можливо підключитись до сервісу").showAndWait();
            return Optional.empty();
        }
    }
}
