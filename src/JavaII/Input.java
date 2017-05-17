package JavaII;

import java.util.Scanner;

/**
 * Created by roxana on 5/16/17.
 */
public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.next();
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }

    public boolean yesNo() {
        String str;
        System.out.println("Do you want to continue?");
        str = this.getString();
        return str.equalsIgnoreCase("y") ||
                str.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.println("Enter an integer between " + min + " and " + max);
            userInput = this.getInt();

        } while (userInput < min || userInput > max);

        return userInput;
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.println("Enter a double between " + min + " and " + max);
            userInput = this.getDouble();

        } while (userInput < min || userInput > max);

        return userInput;
    }
}
