package gr.codehub.CollegeMarks.repository;

import gr.codehub.CollegeMarks.model.Course;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Courses {

    private List<Course> courses;

    public Courses(){
        courses = new ArrayList<>();
    }
}
