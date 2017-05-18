package JavaII;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by roxana on 5/18/17.
 */
public class Movie {
    private String name;
    private String category;
    private PrintStream out;
    private Scanner input;

    public Movie(String name, String category) {
        this.name =name;
        this.category = category;
        this.out = System.out;
        this.input = new Scanner(System.in);
    }

    public String getCategory() {
        return this.category;
    }

    public void printMovie() {
        out.println(this.name + " -- " + this.category);
    }

    public Movie addMovie() {
        out.println("Enter name:");
        String name = input.nextLine();
        System.out.println("Enter category:");
        String category = input.nextLine();
        return new Movie(name, category);
    }
}

class MoviesApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        boolean exit = false;
        Movie movie = new Movie("", "");
        String[] categories = {"animated", "drama", "horror", "scifi"};
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
                } else if(userInput == 1) {
                    movies.get(i).printMovie();
                } else if(userInput >=2 && userInput <= 5) {
                    if(movies.get(i).getCategory().equals(categories[userInput-2])) {
                        movies.get(i).printMovie();
                    }
                } else if(userInput == 6) {
                    movies.add(movie.addMovie());
                    break;
                } else {
                    System.out.println("Choose a valid option");
                    break;
                }
            }
        } while (!exit);

    }
}
