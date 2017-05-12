import java.util.Scanner;

/**
 * Created by roxana on 5/12/17.
 */
public class gameDevelopment101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput, counter = 0, random;
        boolean condition = false;

        random = math.randomNumber.random(1, 100);
//        System.out.println(random);
        System.out.println("Try guessing a number between 1 and 100...\n");

        while (counter < 10 && !condition) {
            System.out.println("Enter number: \n");
            userInput = input.nextInt();
            condition = hint(random, userInput);
            counter++;
        }

        if(counter == 10) {
            System.out.println("Sorry, maybe next time you are going to have more luck...");
        }
    }

    public static boolean hint(int random, int userInput) {
        if(userInput < random) {
            System.out.println("HIGHER");
            return false;
        } else if(userInput > random) {
            System.out.println("LOWER");
            return false;
        } else {
            System.out.println("GOOD GUESS!");
            return true;
        }
    }
}


