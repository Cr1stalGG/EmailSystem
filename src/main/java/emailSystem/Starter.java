package emailSystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Starter extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Email system");
        stage.setWidth(600);
        stage.setHeight(400);

        stage.setScene(new Scene(onStartFXML()));

        stage.show();
    }
    private Parent onStartFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL onStartURL = getClass().getResource("/onStart.fxml");
        loader.setLocation(onStartURL);
        return loader.load();
    }

}
