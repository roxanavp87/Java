import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by roxana on 5/10/17.
 */
public class PlingPlangPlong {
    public static void main(String[] args) {
//        Convert a number to a string, the contents of which depend on the number's factors.
//
//
//        Examples
//
//        28's factors are 1, 2, 4, 7, 14, 28.
//        In raindrop-speak, this would be a simple "Plong".
//        30's factors are 1, 2, 3, 5, 6, 10, 15, 30.
//        In raindrop-speak, this would be a "PlingPlang".
//        34 has four factors: 1, 2, 17, and 34.
//        In raindrop-speak, this would be "34".
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        int num, factor;
        String result = "";

        output.println("Enter a number:");
        num = input.nextInt();

        ArrayList factors = math.factorsOfInteger.factors(num);
        int listSize = factors.size();


        output.println(num + "'s factors are: " + factors);

        for(int i=0; i<listSize ; i++) {
            factor = (int)factors.get(i);
            if (factor == 3) {
                result += "Pling";
            } else if(factor == 5) {
                result += "Plang";
            } else if(factor == 7) {
                result += "Plong";
            }
        }

        if(result.equals("")) {
            result += (int)factors.get(listSize-1);
        }

        output.println("In raindrop-speak, this would be: " + result);
    }
}
