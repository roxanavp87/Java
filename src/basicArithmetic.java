import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by roxana on 5/11/17.
 */
public class basicArithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        String userInput;

//        output.println(math.arithmetic.multiplication(1,3));

        output.println("Type exit to finish.");

        do {
            userInput = input.nextLine();
            if (userInput.indexOf("+") != -1) {
                output.println(addition(numbers(userInput, "+")[0], numbers(userInput, "+")[1]));
            } else if (userInput.indexOf("-") != -1) {
                output.println(substraction(numbers(userInput, "-")[0], numbers(userInput, "-")[1]));
            } else if (userInput.indexOf("*") != -1) {
                output.println(multiplication(numbers(userInput, "*")[0], numbers(userInput, "*")[1]));
            } else if (userInput.indexOf("/") != -1) {
                output.println(division(numbers(userInput, "/")[0], numbers(userInput, "/")[1]));
            } else if (userInput.indexOf("%") != -1) {
                output.println(module(numbers(userInput, "%")[0], numbers(userInput, "%")[1]));
            } else if (userInput.indexOf("!") != -1) {
                output.println(math.arithmetic.factorial((int)numbers(userInput, "!")[0]));
            } else {
                output.println("Operation not valid");
            }
        } while (!userInput.equalsIgnoreCase("exit"));

    }

    public static double addition(double a, double b){
        return a + b;
    }

    public static double substraction(double a, double b){
        return a - b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }

    public static double division(double a, double b){
        return a / b;
    }

    public static double module(double a, double b){
        return a % b;
    }


    public static double[] numbers(String userInput, String operation) {
        double numbers[] = new double[2];
        numbers[0] = Double.valueOf((userInput.substring(0, userInput.indexOf(operation))).trim());
        if ( operation != "!") {
            numbers[1] = Double.valueOf((userInput.substring(userInput.indexOf(operation) + 1, userInput.length())).trim());
        }
        return numbers;
    }
}
