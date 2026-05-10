package Section08AdvancedJavaOOP.Polymorphism.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
//        theMovie.watchMovie();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q for Quit): ");
            String type = input.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = input.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
