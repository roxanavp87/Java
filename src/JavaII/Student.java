package JavaII;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by roxana on 5/22/17.
 */
public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for(Integer grade : grades) {
            sum += grade;
        }

        return sum/(double)grades.size();
    }
}
