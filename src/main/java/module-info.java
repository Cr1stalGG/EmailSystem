module emailSystem{
    requires javafx.controls;
    requires javafx.fxml;

    exports emailSystem to javafx.graphics, javafx.fxml;

    opens emailSystem;
    exports emailSystem.controllers to javafx.fxml, javafx.graphics;
    opens emailSystem.controllers;
}