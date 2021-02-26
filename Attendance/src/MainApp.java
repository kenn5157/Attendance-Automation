import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private String css = "view/primaryStyle.css";

    @Override
    public void start(Stage primaryStage) throws IOException {
        showLoginScreen();


    }

    public void showLoginScreen() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/Login.fxml"));
        AnchorPane login = (AnchorPane) loader.load();

        Scene scene = new Scene(login);
        scene.getStylesheets().add(css);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    // TODO: 25/02/2021 Make it so every element of the view, is modular, and can be put into the program according to necessity
}
