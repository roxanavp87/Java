package pizzaOrder;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by roxana on 5/8/17.
 */
public class pizza {
    public static void main(String[] args) {
        int size;
        float $size[] = {5.99f, 9.99f, 14.99f};
        float $type[] = {0f, 1.5f, 2.5f};
        String extras;
        String extras_array[];
        double cost = 0;

        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;


        //Asking for pizza's size
        output.println("Choose size:\n" + "(1) small\n" + "(2) medium\n" + "(3) large\n");
        cost = $size[input.nextInt()-1];

        //Asking for pizza's type
        output.println("Choose type:\n" + "(1) cheese\n" + "(2) pepperoni\n" + "(3) three meats\n");
        cost += $type[input.nextInt()-1];

        output.println("Choose extras:\n" + "(1) lobster\n" + "(2) shrimps\n" + "(3) pineapple\n" + "(4) bell pepper\n" + "(5) mushrooms\n" +
                "Note: Use numbers separated by commas\n");

        extras = input.next();
        extras_array = extras.split(",");
        cost += extras_array.length * 1.50;

//        input.nextLine();   // to ged rid of the enter form the last call

        output.println("You need to pay: $" + cost);
    }

}
