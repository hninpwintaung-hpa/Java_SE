package homework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Exercise9 {
	private TreeMap<String, Integer> movieMap = new TreeMap<>();

	public void addMovieRelease(String title, int releaseYear) {
		movieMap.put(title, releaseYear);
	}

	public static void main(String[] args) {
		Exercise9 movieReleaseYear = new Exercise9();

		movieReleaseYear.addMovieRelease("The Matrix", 1999);
		movieReleaseYear.addMovieRelease("Inception", 2010);
		movieReleaseYear.addMovieRelease("Star Wars: A New Hope", 1977);
		movieReleaseYear.addMovieRelease("Jurassic Park", 1993);

		String earliestMovie = movieReleaseYear.findEarliestReleasedMovie();

		System.out.println("Earliest released movie: " + earliestMovie);

	}

	public String findEarliestReleasedMovie() {
		String earliestMovie = null;
		int earliestYear = Integer.MAX_VALUE;

		for (Map.Entry<String, Integer> entry : movieMap.entrySet()) {
			int releaseYear = entry.getValue();
			if (releaseYear < earliestYear) {
				earliestYear = releaseYear;
				earliestMovie = entry.getKey();
			}
		}

		return earliestMovie;
	}
}
