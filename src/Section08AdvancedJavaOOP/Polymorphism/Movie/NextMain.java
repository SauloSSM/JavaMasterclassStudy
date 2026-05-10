package Section08AdvancedJavaOOP.Polymorphism.Movie;

public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();
    }
}
