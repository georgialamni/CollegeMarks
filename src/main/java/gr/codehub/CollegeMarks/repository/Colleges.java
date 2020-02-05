package gr.codehub.CollegeMarks.repository;

import gr.codehub.CollegeMarks.model.College;
import gr.codehub.CollegeMarks.model.Student;
import lombok.Data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class Colleges {

    private List<College> colleges;
    private final String CSV_DELIMETER = ",";
    String csvFile = "college.csv";

    public Colleges(){
        colleges = new ArrayList<>();
    }

    public int addCollege(College c) {
        colleges.add(c);
        return colleges.size();
    }

    public Colleges(String filename) {
        this();

        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] words = line.split(CSV_DELIMETER);
                College college = new College(Integer.parseInt(words[0]));

                colleges.add(college);
            }
        } catch (Exception e) {

        }
    }
    public College getCollegeById(int id) {

        for (College college : colleges) {
            if ()
                return college;
        }
        return null;

    }
}
