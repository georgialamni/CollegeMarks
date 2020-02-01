package gr.codehub.CollegeMarks.repository;

import gr.codehub.CollegeMarks.model.Mark;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Marks {

    private List<Mark> marks;

    public Marks(){
        marks = new ArrayList<>();
    }
}
