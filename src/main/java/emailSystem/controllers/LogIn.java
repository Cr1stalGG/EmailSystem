package emailSystem.controllers;

import emailSystem.Email.SendMessage;
import emailSystem.fxUtils.PageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogIn {
    private static String mail;
    private static String password;
    @FXML
    private TextField userMail;
    public static String getMail(){
        return mail;
    }
    @FXML
    private TextField userPassword;
    public static String getPassword(){
        return password;
    }

    public void backAction(ActionEvent actionEvent) throws IOException {
        PageLoader.load(actionEvent, getClass().getResource("/onStart.fxml"));
    }

    public void logInAction(ActionEvent event) {
        mail = userMail.getText();
        password = userPassword.getText();
        SendMessage.sendMessage("alexwinner1337@gmail.com", "Test", "Test message");
    }
}
