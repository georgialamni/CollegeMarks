package gr.codehub.CollegeMarks.service;

import gr.codehub.CollegeMarks.repository.Students;

public interface IStudentService {
    Students getStudents();
    Students getStudentsById();
}
