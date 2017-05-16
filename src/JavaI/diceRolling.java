import java.util.Scanner;

/**
 * Created by roxana on 5/12/17.
 */
public class diceRolling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        String condition;
        do {
            System.out.printf("Enter the number of sides for a pair of dice \n");
            userInput = input.nextInt();
            System.out.println("Rolling the dice...\n" +
                    math.randomNumber.random(1, userInput) + " and " + math.randomNumber.random(1, userInput));
            System.out.println("Type exit to finish or continue to roll again...");
            input.nextLine();
            condition = input.nextLine();
        } while (!condition.equalsIgnoreCase("exit"));

    }
}
