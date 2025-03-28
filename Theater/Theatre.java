public class Theatre {
    String movieName;
    int movie_time;

    public static void main(String[] args) {
        // Creating two instances of Theatre class
        Theatre movie1 = new Theatre();
        Theatre movie2 = new Theatre();

        // Adding movie details for movie1
        movie1.movieName = "Jailer";
        movie1.movie_time = 630;

        // Adding movie details for movie2
        movie2.movieName = "Leo";
        movie2.movie_time = 7;

        // Calling watch_movie method for movie1
        movie1.watch_movie();

        // Calling watch_movie method for movie2
        movie2.watch_movie();
    }

    // Method to watch the movie
    public void watch_movie() {
        System.out.println("Watching " + movieName);
        System.out.println("Show Time is " + movie_time);
    }
}

