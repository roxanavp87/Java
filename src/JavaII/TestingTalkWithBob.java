package JavaII;

/**
 * Created by roxana on 5/17/17.
 */
public class TestingTalkWithBob {
    public static void main(String[] args) {
        Input input = new Input();
        TalkWithBob bob = new TalkWithBob();
        String userInput;

        System.out.println("Type end to finish the conversation.");
        System.out.println(bob.sayHello());
        do {
            userInput = input.getStringLn();
            System.out.println(bob.getAnswer(userInput));
        } while(!userInput.equalsIgnoreCase("end"));
    }
}
