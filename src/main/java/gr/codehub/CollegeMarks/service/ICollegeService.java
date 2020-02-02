package gr.codehub.CollegeMarks.service;

import gr.codehub.CollegeMarks.model.Student;
import gr.codehub.CollegeMarks.repository.Modules;
import gr.codehub.CollegeMarks.repository.Students;

public interface ICollegeService {

    Students getStudents();
    Students getStudentsById(int id);

    Modules getModules();
    Modules getModulesById(int id);
}
