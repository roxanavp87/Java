package JavaII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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


class TestingStudent {
    public static void main(String[] args) {
        Student student = new Student("Rox");
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
