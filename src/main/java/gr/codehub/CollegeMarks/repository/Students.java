package gr.codehub.CollegeMarks.repository;

import gr.codehub.CollegeMarks.model.Student;
import lombok.Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class Students {

    private List<Student> students;
    private final String CSV_DELIMETER = ",";
    String csvFile = "students.csv";

    String line = " ";
    String cvsSplitBy = ",";


    public Students(){
        students = new ArrayList<>();
    }

    public int addStudent(Student s){
        students.add(s);
        return students.size();
    }

    public Students(String filename) {
        this();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] customer = line.split(",");
                Student c = new Student(Integer.parseInt(customer[0]), customer[1], customer[2],customer[3]);
                students.a
            }
        }
        } catch (Exception e) {

        }

    }
}
