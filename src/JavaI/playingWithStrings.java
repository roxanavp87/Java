import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by roxana on 5/11/17.
 */
public class playingWithStrings {
    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//                He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//                He answers 'Whatever.' to anything else.


        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        String user;

        output.println("Type end to finish the conversation.");
        output.println("Hi, I'm Bob");

        do {
            user = input.nextLine();
            output.println(response(user));
        } while (!user.equalsIgnoreCase("end"));

    }

    private static String response(String question) {
        String answer = "It's the end";
        if(!question.equalsIgnoreCase("end")) {
            if (question.endsWith("?")) {
                answer = "Sure";
            } else if (question.trim().equals("")) {
                answer = "Fine. Be that way";
            } else if (question.equals(question.toUpperCase()) && !question.equals(question.toLowerCase())) {
                answer = "Whoa, chill out!";
            } else {
                answer = "Whatever";
            }
        }
        return answer;
    }

}
