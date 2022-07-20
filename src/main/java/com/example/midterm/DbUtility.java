package com.example.midterm;


import java.sql.*;
import java.util.ArrayList;

public class DbUtility {
    private static String user = Dbcredentials.user;
    private static String password = Dbcredentials.password;
    private static String connectURL = "jdbc:mysql://localhost:3306/javaTest";


    public static ArrayList<Student> getStudentsFromDB() {
        ArrayList<Student> Students = new ArrayList<>();

        String sql = "SELECT * FROM students where studentnum between 200034000 and 200070000;";

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                int student_number = resultSet.getInt("studentNum");
                String first_name = resultSet.getString("firstName");
                String last_name = resultSet.getString("lastName");
                String gender = resultSet.getString("gender");
                String telephone_number = resultSet.getString("telephone");
                String province = resultSet.getString("province");
                int average_grade = resultSet.getInt("avgGrade");
                String major_code = resultSet.getString("majorCode");

                Students.add(new Student(first_name, last_name, gender,province, telephone_number,major_code , student_number,average_grade));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Students;
    }

    public static ArrayList<Student> getStudentsByProvince(String state) {
        ArrayList<Student> Students = new ArrayList<>();

        String sql = String.format("SELECT * FROM students WHERE province = '%s'", state);

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                int student_number = resultSet.getInt("studentNum");
                String first_name = resultSet.getString("firstName");
                String last_name = resultSet.getString("lastName");
                String gender = resultSet.getString("gender");
                String telephone_number = resultSet.getString("telephone");
                String province = resultSet.getString("province");
                int average_grade = resultSet.getInt("avgGrade");
                String major_code = resultSet.getString("majorCode");

                Students.add(new Student(first_name, last_name, gender,province, telephone_number, major_code, student_number,average_grade ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Students;
    }
}