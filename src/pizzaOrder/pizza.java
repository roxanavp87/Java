package pizzaOrder;

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

        Scanner sc = new Scanner(System.in);

        //Asking for pizza's size
        System.out.println("Choose size:\n" + "(1) small\n" + "(2) medium\n" + "(3) large\n");
        int x = sc.nextInt();
        cost = $size[x-1];

        //Asking for pizza's type
        System.out.println("Choose type:\n" + "(1) cheese\n" + "(2) pepperoni\n" + "(3) three meats\n");
        x = sc.nextInt();
        cost += $type[x-1];

        System.out.println("Choose extras:\n" + "(1) lobster\n" + "(2) shrimps\n" + "(3) pineapple\n" + "(4) bell pepper\n" + "(5) mushrooms\n" +
                "Note: Use numbers separated by commas\n");

        extras = sc.next();
        extras_array = extras.split(",");
        cost += extras_array.length * 1.50;

//        sc.nextLine();   // ged rid of the enter form the last call

        System.out.println("You need to pay: $" + cost);
    }

}
