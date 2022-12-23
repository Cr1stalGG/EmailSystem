package emailSystem.controllers;

import emailSystem.Email.SendMessage;
import emailSystem.fxUtils.PageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogIn {

    @FXML
    public static TextField userMail;
    @FXML
    public static TextField userPassword;

    public void backAction(ActionEvent actionEvent) throws IOException {
        PageLoader.load(actionEvent,getClass().getResource("/onStart.fxml"));
    }

    public void logInAction(ActionEvent event) {
        SendMessage.sendMessage("alexwinner1337@gmail.com", "Test", "Test message");
    }
}
