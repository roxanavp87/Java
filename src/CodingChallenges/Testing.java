package CodingChallenges;

import java.util.Scanner;

/**
 * Created by roxana on 5/17/17.
 */
public class Testing {
    public static void main(String[] args) {
        checkPassword pass = new checkPassword();
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter password");
//        String password = input.next();
//        System.out.println(pass.checkPass(password));


        sumOfNumbersInString in = new sumOfNumbersInString();
        System.out.println("Enter word with numbers");
        String word = input.nextLine();
        System.out.println(in.sumOfNumbers(word));
    }
}
