package tableOfPowers;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by roxana on 5/9/17.
 */
public class tableOfPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        int number;
        String tab, condition;

        do {
            output.println("What number do you want to go up to?");
            number = input.nextInt();
            output.println("number  | squared   | cubed\n" +
                    "------  | -------   | -----");
            for (int i = 1; i <= number; i++) {
                if (i < 4) {
                    tab = "\t\t\t| ";
                } else {
                    tab = "\t\t| ";
                }
                output.printf(i + "\t\t| " + (int) Math.pow(i, 2) + tab + (int) Math.pow(i, 3) + '\n');
            }

            output.println("Press Y if you want to try with other number, or N if you want to finish...");
            condition = input.next();
        } while(condition.equalsIgnoreCase("y"));
    }
}
