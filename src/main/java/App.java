import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();
        System.out.println("Print title : ");
        String title = sc.next();
        System.out.println( "Print genre : " );
        String genre = sc.next();
        movie.setTitle(title);
        movie.setGenre(genre);

        //instantiate movieService
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
