package com.example.midterm;

import com.example.midterm.Student;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class TableviewController implements Initializable {

    @FXML
    private TableColumn<Student, Integer> Studentcol;

    @FXML
    private TableColumn<Student, String> Firstname;

    @FXML
    private TableColumn<Student, String> genderid;

    @FXML
    private TableColumn<Student, String> Lastname;

    @FXML
    private TableColumn<Student, String> majorid;

    @FXML
    private TableColumn<Student, String> provinceid;

    @FXML
    private TableColumn<Student, Integer> avggradeid;
    @FXML
    private TableColumn<Student, String> telephoneid;
    @FXML
    private TableView<Student> Tableview;
    @FXML
    private Label labelid;
    @FXML
    private ComboBox<String> comboboxid;
    @FXML
    private Button buttonid;

    public void initialize(URL url, ResourceBundle resourceBundle) {

        Firstname.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        Lastname.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        majorid.setCellValueFactory(new PropertyValueFactory<>("major_code"));
        genderid.setCellValueFactory(new PropertyValueFactory<>("gender"));
        avggradeid.setCellValueFactory(new PropertyValueFactory<>("average_grade"));
        provinceid.setCellValueFactory(new PropertyValueFactory<>("province"));
        Studentcol.setCellValueFactory(new PropertyValueFactory<>("student_number"));
        telephoneid.setCellValueFactory(new PropertyValueFactory<>("telephone_number"));
        Tableview.getItems().addAll(DbUtility.getStudentsFromDB());
        labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
        List<String> provincename= Arrays.asList("AB", "BC", "MB", "NB", "NL", "NS", "NT", "NU", "ON", "PE", "QC", "SK", "YT");

        comboboxid.getItems().addAll(provincename);
        labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));

        comboboxid.valueProperty().addListener((obs, oldValue, newValue) -> {
            switch (newValue) {
                case "AB" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("AB"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "BC" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("BC"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "MB" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("MB"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NB" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("NB"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NL" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("NL"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NS" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("NS"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NT" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("NT"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NU" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("NU"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "ON" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("ON"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "PE" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("PE"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "QC" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("QC"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "SK" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("SK"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "YT" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(DbUtility.getStudentsByProvince("YT"));
                    labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
            }
        });
        buttonid.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Tableview.getItems().clear();
                Tableview.getItems().addAll(DbUtility.getStudentsFromDB());
                labelid.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
            }
        });
    }
}

