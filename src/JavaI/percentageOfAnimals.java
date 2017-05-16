import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by roxana on 5/10/17.
 */
public class percentageOfAnimals {
//    Write a Java command line application to represent/solve the following problem
//
//    A Zoologist wants to determine the percentage of animals in the following
//    three age categories:
//
//            * 0 to 1 year,
//            * over 1 year and less than 3
//            * 3 or more years.
//
//    The zoologist is not yet sure about which animal to study. If she decide
//    on elephants, you will only take a sample of 20 of them; If she decides
//    on giraffes, only take 15 samples, otherwise chimpanzees will be
//    studied, and the sample size will be 40.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        int arrayOflenghtOfSamples[] = {20, 15, 40}, lenghtOfSamples;
        ArrayList samples = new ArrayList();


        output.println("Select the animal:\n" +
                        "(1) Elephants\n" +
                        "(2) Giraffes\n" +
                        "(3) Chimpanzees\n");

        lenghtOfSamples = input.nextInt() - 1;
        for(int i=1; i< lenghtOfSamples; i++) {
            samples.add(Math.round(Math.random()*5));
        }
        output.println(samples);
    }
}
