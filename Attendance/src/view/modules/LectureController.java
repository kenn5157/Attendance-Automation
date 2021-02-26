package view.modules;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LectureController implements Initializable {

    public TitledPane titlePaneTitle;
    public Label classContentLabel;
    public Label attendanceLabel;
    public CheckBox attendanceCheckBox;

    String className = "N/A";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO: 20/02/2021 Get class name from where?
        //Temoraryly set className
        className = "Lecture Name";

        setContext();
    }

    private void setContext() {
        titlePaneTitle.setText(className);
        classContentLabel.setText("Quick view of class");
    }

    public void checkAttendanceBtn(ActionEvent actionEvent) {
        attendanceLabel.setText("Attending");
    }

    public void saveAttendance(ActionEvent actionEvent) {
        // TODO: 20/02/2021 Save Attendance somewhere
    }
}
