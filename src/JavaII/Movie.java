package JavaII;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by roxana on 5/18/17.
 */
public class Movie {
    public String name;
    public String category;
    private PrintStream out = System.out;

    public Movie(String name, String category) {
        this.name =name;
        this.category = category;
    }

    public void printMovie() {
        out.println(this.name + " -- " + this.category);
    }
}

class MoviesApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        boolean exit = false;
        String menu = "\n\nWhat would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add movies\n";

        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(MoviesArray.findAll()));


        do {
            System.out.println(menu + "Enter your choice:");
            userInput = input.nextInt();

            for (int i = 0; i < movies.size(); i++) {
                if (userInput == 0) {
                    exit = true;
                    break;
                }
                if(userInput == 6) {
                    System.out.println("Enter name:");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.println("Enter category:");
                    String category = input.nextLine();
                    movies.add(new Movie(name, category));
                    break;
                }
                switch (userInput) {
                    case 1:
                        movies.get(i).printMovie();
                        break;
                    case 2:
                        if (movies.get(i).category.equals("animated")) {
                            movies.get(i).printMovie();
                        }
                        break;
                    case 3:
                        if (movies.get(i).category.equals("drama")) {
                            movies.get(i).printMovie();
                        }
                        break;
                    case 4:
                        if (movies.get(i).category.equals("horror")) {
                            movies.get(i).printMovie();
                        }
                        break;
                    case 5:
                        if (movies.get(i).category.equals("scifi")) {
                            movies.get(i).printMovie();
                        }
                        break;
                    default:

                }
            }
        } while (!exit);

    }
}
