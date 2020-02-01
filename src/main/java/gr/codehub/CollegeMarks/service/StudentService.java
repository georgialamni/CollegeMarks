package gr.codehub.CollegeMarks.service;

import gr.codehub.CollegeMarks.repository.Students;

public class StudentService implements IStudentService {

    @Override
    public Students getStudents() {
        return new Students("student.csv");
    }

    @Override
    public Students getStudentsById() {
        return null;
/*        Students students = new Students("student.csv");
        return students.getStudentsById(id);*/
    }
}
