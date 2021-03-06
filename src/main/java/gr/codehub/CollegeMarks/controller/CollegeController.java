package gr.codehub.CollegeMarks.controller;

import gr.codehub.CollegeMarks.repository.Students;
import gr.codehub.CollegeMarks.service.ICollegeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

    private ICollegeService cs;

    @GetMapping("")
    public String getIntro(){
        return  ("Welcome to college! " +
                " Please select module or student.");
    }

    @GetMapping("students")
    public Students getStudents(){
        return  cs.getStudents();
    }
}
