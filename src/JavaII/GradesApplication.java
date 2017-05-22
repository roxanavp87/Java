package JavaII;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

    public void printKey() {
        students.forEach((k, v) -> System.out.print("| "+ k + "| "));
    }

    public void printStudentInfo(String key) {
        if(students.get(key) != null) {
            System.out.println("Name: " + students.get(key).getName() +
                    "\nCurrent Average: " + students.get(key).getGradeAverage());
            students.get(key).printGrades();
        } else {
            System.out.println("Sorry, no student found with the gihub username of " + key);
        }
    }
}


class TestingGradesapplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        Student student1 = new Student("rox");
        student1.addGrade(4);
        student1.addGrade(5);


        Student student2 = new Student("tuesday");
        student2.addGrade(5);
        student2.addGrade(5);


        GradesApplication grades = new GradesApplication();
        grades.addStudents("roxanavp87", student1);
        grades.addStudents("tuesdayS", student2);


        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");
        grades.printKey();

        do {
            System.out.println("\nWhat student would you like to see more information on?");
            userInput = input.nextLine();
            grades.printStudentInfo(userInput);

            System.out.println("Would you like to see another student? (y/n)");
            userInput = input.nextLine();
        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("Goodbye, and have a wonderful day!");
        
    }
}
