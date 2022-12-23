package emailSystem.controllers;

import emailSystem.fxUtils.PageLoader;
import javafx.event.ActionEvent;

import java.io.IOException;

public class OnStart {

    public void registrationAction(ActionEvent actionEvent) throws IOException {
        PageLoader.load(actionEvent, getClass().getResource("/registration.fxml"));
    }

    public void logInAction(ActionEvent actionEvent) throws IOException {
        PageLoader.load(actionEvent, getClass().getResource("/logIn.fxml"));
    }
}
