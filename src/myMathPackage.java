/**
 * Created by roxana on 5/8/17.
 */

import math.*;

import java.io.PrintStream;
import java.util.Scanner;

public class myMathPackage {
    public static void main(String[] args) {

        PrintStream output = System.out;

        double grades[] = {98, 45, 15, 99, 78};
        output.println("Average of grades is: " + math.averageOfArray.average(grades));
        output.println("Lowest grade is: " + math.minOfArray.min(grades));
        output.println("Greater grade is: " + math.maxOfArray.max(grades));

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer: ");
        long num = input.nextLong();

        for(long i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                System.out.println(i);
                if(i != num/i) {
                    System.out.println(num/i);
                }
            }
        }

    }

}


