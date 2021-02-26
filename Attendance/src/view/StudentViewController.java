package view;

import be.User;
import bll.ApplicationLogic;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {

    private int TEST_USER_ID = 2;

    public DatePicker dateSelector;
    public VBox classesForSelectedDay;
    public PieChart pieChart;

    public Label attendedLabel;
    public Label absentLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dateSelector.setShowWeekNumbers(true);

        loadPie();
        //loadDate();
    }

    private void loadDate() {
        LocalDate comparedDate =  LocalDate.of(2021,2,20);
        //dateSelector.setValue(comparedDate);
        LocalDate selectedDate = dateSelector.getValue();

        // TODO: 20/02/2021 Add All Classes for selected day by getting a list of classes from said date

        Boolean isTrue = selectedDate.isEqual(comparedDate);

        removeAllModules();
        if (isTrue) {
            loadModule("Lecture", "SDE");
        } else {
            loadDateLectures();
        }
    }

    public void selectDate(ActionEvent actionEvent) {
        loadDate();
    }

    private void loadDateLectures() {
        removeAllModules();
        loadModule("Lecture", "SDE");
        loadModule("Lecture", "SDE");
        loadModule("Lecture", "SDE");
        loadModule("Lecture", "SDE");
    }

    private void loadModule(String module, String lectureName) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(StudentViewController.class.getResource("modules/" + module + ".fxml"));
            TitledPane titledPane = (TitledPane) loader.load();
            titledPane.setExpanded(true);
            titledPane.animatedProperty().setValue(false);

            classesForSelectedDay.getChildren().add(titledPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void removeAllModules() {
        classesForSelectedDay.getChildren().clear();
    }

    private void loadPie() {
        ApplicationLogic applicationLogic = new ApplicationLogic();

        int userid = TEST_USER_ID;

        int attended = applicationLogic.getAttended(userid);
        int absent = applicationLogic.getAbsent(userid);

        // TODO: 20/02/2021 Make it get pie data from user
        PieChart.Data sliceOne = new PieChart.Data("Attended", attended);
        PieChart.Data sliceTwo = new PieChart.Data("Absent", absent);

        attendedLabel.setText(String.valueOf(attended));
        absentLabel.setText(String.valueOf(absent));

        pieChart.getData().addAll(sliceOne, sliceTwo);
    }
}
