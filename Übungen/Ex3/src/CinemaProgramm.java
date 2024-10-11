import java.util.ArrayList;
import java.util.List;

public class CinemaProgramm {

    private String theaterName;
    private List<Movie> movies;

    public CinemaProgramm(String theaterName) {
        this.theaterName = theaterName;
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
    	if (movie.getProductionCompany().getBudget() >= 50000)
    		movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public long getTotalDuration() {
        long totalDuration = 0;
        for (Movie movie : movies) {
            totalDuration += movie.getDuration();
        }
        return totalDuration;
    }

    public void printProgramm() {
        System.out.println("Programm von " + theaterName);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

}
