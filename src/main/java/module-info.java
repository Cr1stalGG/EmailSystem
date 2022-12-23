module emailSystem{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.mail;


    exports emailSystem to javafx.graphics, javafx.fxml;


    opens emailSystem;
    exports emailSystem.controllers to javafx.fxml, javafx.graphics;
    opens emailSystem.controllers;
    exports emailSystem.Email to javafx.fxml, javafx.graphics;
    opens emailSystem.Email;
}