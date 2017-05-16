import java.util.Scanner;

/**
 * Created by roxana on 5/12/17.
 */
public class IsNumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;

        System.out.println("Enter a number between 1 and 10: ");
        validate(1,10);
    }

    public static void validate(int min, int max) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if(userInput > min && userInput < max) {
            System.out.println("Correct!!");
        } else {
            System.out.println("Wrong... enter other number");
            validate(min, max);
        }
    }
}
