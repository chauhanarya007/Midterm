package com.example.midterm;

import java.util.Arrays;
import java.util.List;

public class Student {
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        if(first_name.length() > 1){
            this.first_name = first_name;
        }else{
            throw new IllegalArgumentException("First name must be more than 1 character");
        }
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        if(last_name.length() > 1)
        this.last_name = last_name;
        else{
            throw new IllegalArgumentException("Last name must be more than 1 character");
        }
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        //Province should be in the list of "AB","BC","MB","NB","NL","NS","NT","NU","ON","PE","QC","SK","YT"
        List<String> provinceName= Arrays.asList("AB", "BC", "MB", "NB", "NL", "NS", "NT", "NU", "ON", "PE", "QC", "SK", "YT");
        if(provinceName.contains(province))
        {
            this.province = province;
        }
        else
        {
            throw new IllegalArgumentException(province + " is not valid, choose from " + provinceName);
        }

    }

    public int getStudent_number(int student_number) {
        return student_number;
    }

    public void setStudent_number(int student_number) {
        if(student_number > 200034000 && student_number < 200070000){
            this.student_number = student_number;

        }else{
            throw new IllegalArgumentException("a.\tThe student number should be in the range 200034000 to 200070000");
        }
        this.student_number = student_number;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        if (telephone_number.matches("[02-9]\\d{0,9}")) {
            this.telephone_number = telephone_number;
        }
        else {
            this.telephone_number = "Not Valid";
        }
    }

    public int getAverage_grade() {
        return average_grade;
    }

    public void setAverage_grade(int average_grade) {
        if(average_grade >= 0 && average_grade <= 100){
            this.average_grade = average_grade;
        }else{
            throw new IllegalArgumentException("The range should be 1-100");
        }
    }

    public String getMajor_code() {
        return major_code;
    }

    public void setMajor_code(String major_code) {
        for (int i = 0; i < 4; i++) {
            if (Character.isUpperCase(major_code.charAt(i))) {
                this.major_code = major_code;
            }else{
                throw new IllegalArgumentException("Major Code must have 4 UpperCase Letters");
            }
        }

    }

    public Student(String first_name, String last_name, String gender, String telephone_number, String province, int student_number, int average_grade, String major_code) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.province = province;
        this.student_number = student_number;
        this.telephone_number = telephone_number;
        this.average_grade = average_grade;
        this.major_code = major_code;
    }

    private String first_name, last_name, gender, province, telephone_number, major_code;
    private int student_number, average_grade;
}
