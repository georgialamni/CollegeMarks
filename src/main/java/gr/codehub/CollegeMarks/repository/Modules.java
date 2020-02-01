package gr.codehub.CollegeMarks.repository;

import gr.codehub.CollegeMarks.model.Module;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Modules {

    private List<Module> modules;

    public Modules(){
        modules = new ArrayList<>();
    }
}
