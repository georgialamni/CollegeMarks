package gr.codehub.CollegeMarks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {

    private int id;
    private String course;
    private String firstName;
    private String lastName;
}
