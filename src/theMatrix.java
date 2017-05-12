import java.util.Scanner;

/**
 * Created by roxana on 5/12/17.
 */
public class theMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput;

        System.out.println("Enter a number: \n");
        userInput = in.nextInt();
        matrix(userInput);

    }

    public static void matrix(int num) {
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                System.out.print((byte)Math.round(Math.random()));
            }
            System.out.println("");
        }
    }
}
