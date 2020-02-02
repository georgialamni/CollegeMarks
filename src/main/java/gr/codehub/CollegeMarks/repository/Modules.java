package gr.codehub.CollegeMarks.repository;

import gr.codehub.CollegeMarks.model.Module;
import gr.codehub.CollegeMarks.model.Student;
import lombok.Data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class Modules {

    private List<Module> modules;
    private final String CSV_DELIMETER = ",";
    String csvFile = "modules.csv";

    String line = " ";
    String cvsSplitBy = ",";

    public Modules() {
        modules = new ArrayList<>();
    }

    public int addModules(Module m) {
        modules.add(m);
        return modules.size();
    }

    public Modules(String filename) {
        this();

        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] words = line.split(CSV_DELIMETER);
                Module module = new Module(Integer.parseInt(words[0]), words[1], words[2], words[3]);

                modules.add(module);
            }
        } catch (Exception e){

        }
    }

    public Module getModuleById(int id) {

        for (Module module : modules) {
            if (module.getId() == id)
                return module;
        }
        return null;

    }
}
