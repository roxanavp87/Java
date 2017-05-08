package console;

import java.util.Scanner;

/**
 * Created by roxana on 5/8/17.
 */
public class ConsoleExercises {
    public static void main(String[] args) {
        int n;
//        declaring an empty array
        String array[] = new String[3];
        String sentence;
        double width, length, height;


        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        n = sc.nextInt();
//        System.out.println("Number:" + n);

//        System.out.println("Enter 3 worlds, press enter each time...");
//        for(int i=0; i< array.length; i++) {
//            array[i] = sc.nextLine();
//            System.out.println("World " + i + ": " + array[i]);
//        }

//        System.out.println("Enter a sentence");
//        System.out.println(sc.nextLine());

        System.out.println("Enter the width of the classroom");
        System.out.println("Enter the length of the classroom");
        System.out.println("Enter the height of the classroom");

        // using string
        width = Double.parseDouble(sc.nextLine());
        length = Double.parseDouble(sc.nextLine());
        height = Double.parseDouble(sc.nextLine());


        // using decimal entries
//        width = sc.nextDouble();
//        length = sc.nextDouble();
//        height = sc.nextDouble();

        System.out.println("Area = " + width*length);
        System.out.println("Perimeter = " + (2*length + 2*width));
        System.out.println("Volume = " + length*width*height);


    }
}
