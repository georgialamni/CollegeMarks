package gr.codehub.CollegeMarks.service;

        import gr.codehub.CollegeMarks.repository.Modules;
        import gr.codehub.CollegeMarks.repository.Students;

public class CollegeService implements ICollegeService {

    @Override
    public Students getStudents() {
        return new Students("student.csv");
    }

    @Override
    public Students getStudentsById(int id) {
       // return null;
        Students students = new Students("student.csv");
        return students.getStudentById(id);
    }

    @Override
    public Modules getModules() {
        return new Modules("module.csv");
    }

    @Override
    public Modules getModulesById(int id) {
        Modules modules = new Modules("module.csv");
        return modules.getModulesById(id);
    }
}
