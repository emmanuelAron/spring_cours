import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;
import com.mycompany.dvdstore.service.MovieServiceInterface;

public class App {
    public static void main(String[] args) {

        MovieController movieController = new MovieController();
        GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
        MovieService movieService = new MovieService();
        movieService.setMovieRepository(movieRepository);

        movieController.setMovieService(movieService);

        movieController.addUsingConsole();
    }
}
