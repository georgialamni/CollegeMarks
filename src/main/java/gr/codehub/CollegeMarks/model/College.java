package gr.codehub.CollegeMarks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
    private String name;
    private int id;

    public College(int parseInt) {
        College college = new College();
    }
}
