package JavaII;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by roxana on 5/22/17.
 */
public class GradesApplication {
    private Map<String, Student> students = new HashMap<>();

    public void addStudents(String gitUsername, Student student) {
        this.students.put(gitUsername, student);
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    public void printMap() {
        students.forEach((k, v) -> System.out.println("Git username: "+k+" Grades average: "+v.getGradeAverage()));
    }
}


class TestingGradesapplication {
    public static void main(String[] args) {
        Student student1 = new Student("rox");
        student1.addGrade(4);
        student1.addGrade(5);


        Student student2 = new Student("tuesday");
        student2.addGrade(5);
        student2.addGrade(5);


        GradesApplication grades = new GradesApplication();
        grades.addStudents("roxanavp87", student1);
        grades.addStudents("tuesdayS", student2);


        grades.printMap();

        
    }
}
