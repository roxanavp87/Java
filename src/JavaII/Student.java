package JavaII;

import java.util.*;
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
        return grades.stream().mapToInt(value -> value).average().getAsDouble();
    }

    public void printGrades() {
        System.out.println(Arrays.toString(grades.toArray()));
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
