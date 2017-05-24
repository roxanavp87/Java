package JavaII;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by roxana on 5/16/17.
 */
public class Input {
    private Scanner scanner;
    private PrintStream output;

    public Input() {
        this.scanner = new Scanner(System.in);
        this.output = System.out;
    }

    public String getString() {
        return this.scanner.next();
    }

    public String getStringLn() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        output.println(prompt);
        return this.scanner.next();
    }

    public int getInt() {
        String userInput = getStringLn();
        int output = 0;
        try {
            output = Integer.valueOf(userInput);

        } catch (Exception e) {
            System.out.println("not valid input");
        }
        return output;
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }

    // static coupling
    public boolean yesNo() {
        String str;
        output.println("Do you want to continue?");
        str = this.getString();
        return str.equalsIgnoreCase("y") ||
                str.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            output.println("Enter an integer between " + min + " and " + max);
            userInput = this.getInt();

        } while (userInput < min || userInput > max);

        return userInput;
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            output.println("Enter a double between " + min + " and " + max);
            userInput = this.getDouble();

        } while (userInput < min || userInput > max);

        return userInput;
    }
}


class TestingInput {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter integer:");
        System.out.println(input.getInt());
    }
}
