import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by roxana on 5/9/17.
 */
public class fizzbuzzTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        for(int i=1; i<=100; i++) {
            if( (i % 3 == 0) && (i % 5 == 0)) {
                output.println("FizzBuzz");
            } else if(i % 3 == 0) {
                output.println("Fizz");
            } else if(i % 5 == 0) {
                output.println("Buzz");
            } else {
                output.println(i);
            }

        }
    }
}
