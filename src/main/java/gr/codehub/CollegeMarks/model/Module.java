package gr.codehub.CollegeMarks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Module {

    private String name;
    private String course;
    private String assignedTutor;
    private ModuleType moduleType;
}
