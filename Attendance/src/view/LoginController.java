package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public Label titleLabel;
    public TextField usernameField;
    public PasswordField passwordField;

    public LoginController() {

    }

    public void applicaitonClose(ActionEvent actionEvent) {
    }

    public void applicaitonLogin(ActionEvent actionEvent) throws IOException {
        int userType = Integer.parseInt(usernameField.getText());

        if (userType == 0) {
            showUserView("TeacherView", "Teacher");
        } else if (userType == 1) {
            showUserView("StudentView", "Student");
        } else if (userType >= 2) {
            System.out.println("User type does not exist");
        }
    }

    private void showUserView(String userViewFile, String stageTitle) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(LoginController.class.getResource(userViewFile + ".fxml"));
        AnchorPane userScreen = (AnchorPane) loader.load();

        Scene scene = new Scene(userScreen);
        scene.getStylesheets().add("view/primaryStyle.css");
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(stageTitle);
        stage.show();
    }


}
