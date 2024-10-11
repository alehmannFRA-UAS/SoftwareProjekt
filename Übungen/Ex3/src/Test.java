public class Test {

    public static void main(String[] args) {
        Movie movie1 = new BlockBuster("Dune", new ProductionCompany("Warner Bros.", 1000000), false, true);
        Movie movie2 = new BlockBuster("Frozen", new ProductionCompany("Disney", 2000000), true, false);
        Movie movie3 = new BlockBuster("Joker", new ProductionCompany("Warner Bros.", 55000000), false, false);

        long totalDuration = movie1.getDuration() + movie2.getDuration() + movie3.getDuration();

        CinemaProgramm cinemaProgramm = new CinemaProgramm("Cineplex");
        cinemaProgramm.addMovie(movie1);
        cinemaProgramm.addMovie(movie2);
        cinemaProgramm.addMovie(movie3);

        testNoFilms(cinemaProgramm);
        testThreeFilms(cinemaProgramm, totalDuration);

        CinemaProgramm cinemaProgramm2 = new CinemaProgramm("UCI");

        testNoFilms(cinemaProgramm2);
        testThreeFilms(cinemaProgramm2, totalDuration);
    }

    private static void testNoFilms(CinemaProgramm cinemaProgramm) {
        if(cinemaProgramm.getTotalDuration() != 0) {
            System.out.println("Test failed: testNoFilms");
        } else {
            System.out.println("Test passed: testNoFilms");
        }
    }

    private static void testThreeFilms(CinemaProgramm cinemaProgramm, long totalDuration) {
        if(cinemaProgramm.getTotalDuration() != totalDuration) {
            System.out.println("Test failed: testThreeFilms");
        } else {
            System.out.println("Test passed: testThreeFilms");
        }
    }

}
