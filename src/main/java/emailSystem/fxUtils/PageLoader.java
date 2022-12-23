package emailSystem.fxUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class PageLoader {
    private static Stage stage;
    private static Scene scene;
    private static Parent root;
    public static void load(ActionEvent actionEvent, URL pageUrl) throws IOException {
        root = FXMLLoader.load(pageUrl);
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
