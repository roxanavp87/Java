package numberToLetterGrades;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by roxana on 5/10/17.
 */
public class numberToLetterGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        int numericalGrade;
        String condition;


        do {
            output.println("Enter a grade from 0 to 100: ");
            numericalGrade = input.nextInt();

            if (convert(numericalGrade).equals("")) {
                output.println("Enter a valid number");
            } else {
                output.println("Your grade is: " + convert(numericalGrade));
            }
            output.println("Press Y if you want to enter other grade, or N if you want to finish...");
            condition = input.next();
        } while (condition.equalsIgnoreCase("y"));


    }

    private static String convert(int number) {
        if(number > 0 && number < 60) {
            return "F";
        }
        if(number >= 60 && number < 67) {
            return "D";
        }
        if(number >= 67 && number < 80) {
            return "C";
        }
        if(number >= 80 && number < 88) {
            return "B";
        }
        if(number >= 88 && number < 100) {
            return "A";
        }
        return "";
    }
}
