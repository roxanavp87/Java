package JavaII;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by roxana on 5/22/17.
 */
public class Student {
    private String name;
    private IntStream grades;

    public Student(String name) {
        this.name = name;
        this.grades = IntStream.empty();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades = IntStream.concat(grades, IntStream.of(grade));
    }

    public double getGradeAverage() {
        return this.grades.average().getAsDouble();
    }
}


class TestingStudent {
    public static void main(String[] args) {
        Student student;
        Scanner input = new Scanner(System.in);
        int grade;

        System.out.println("Enter student's name");
        student = new Student(input.nextLine());

        System.out.println("Enter grades (type -1 to finish)");

        grade = input.nextInt();
        while (grade != -1) {
            student.addGrade(grade);
            grade = input.nextInt();
        }

        System.out.println("Average: " + student.getGradeAverage());
    }
}
