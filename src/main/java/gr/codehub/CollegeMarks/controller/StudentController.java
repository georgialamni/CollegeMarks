package gr.codehub.CollegeMarks.controller;

import gr.codehub.CollegeMarks.repository.Students;
import gr.codehub.CollegeMarks.service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private IStudentService iss;

    @GetMapping("")
    public String getIntro(){
        return  ("Welcome to college! " +
                " Please select module or student.");
    }

/*    @GetMapping("students")
    public Students getStudents(){
        return  iss.getStudents();
    }*/
}
