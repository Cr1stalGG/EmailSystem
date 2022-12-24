package emailSystem.controllers;

import emailSystem.Email.SendMessage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SendPage {

    @FXML
    public TextArea text;
    @FXML
    public TextField subject;
    @FXML
    public TextField toMail;

    public void sendMail(ActionEvent event){
        SendMessage.sendMessage(toMail.getText(), subject.getText(), text.getText());
    }
}
