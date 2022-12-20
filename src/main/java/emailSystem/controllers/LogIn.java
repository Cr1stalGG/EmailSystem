package emailSystem.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogIn {

    @FXML
    public TextField userMail;
    @FXML
    public TextField userPassword;

    private Stage stage;
    private Scene scene;
    public void backAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/onStart.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void logInAction(ActionEvent event) {
    }
}
