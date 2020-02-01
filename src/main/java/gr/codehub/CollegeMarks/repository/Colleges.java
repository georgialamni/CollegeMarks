package gr.codehub.CollegeMarks.repository;

import gr.codehub.CollegeMarks.model.College;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Colleges {

    private List<College> colleges;

    public Colleges(){
        colleges = new ArrayList<>();
    }
}
