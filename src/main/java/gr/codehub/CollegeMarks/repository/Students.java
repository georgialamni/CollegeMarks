package gr.codehub.CollegeMarks.repository;

import gr.codehub.CollegeMarks.model.Student;
import lombok.Data;

import java.io.File;
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


    public Students() {
        students = new ArrayList<>();
    }

    public int addStudent(Student s) {
        students.add(s);
        return students.size();
    }

    public Students(String filename) {
        this();

        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] words = line.split(CSV_DELIMETER);
                Student student = new Student(Integer.parseInt(words[0]), words[1], words[2], words[3]);

                students.add(student);
            }
        } catch (Exception e) {

        }
    }

    public Student getStudentById(int id) {

        for (Student student : students) {
            if (student.getId() == id)
                return student;
        }
        return null;

    }
}

