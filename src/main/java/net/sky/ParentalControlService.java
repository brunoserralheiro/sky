/**
 * 
 */
package net.sky;

import java.util.ArrayList;

/**
 * @author Bruno Serralheiro
 *
 */

public class ParentalControlService {

	/**
	 * 
	 */
	public ArrayList<Movie> movieList = new ArrayList<Movie>();
	
	public ParentalControlService(ArrayList<Movie> movieList) {
	
		this.movieList = movieList;
		
	}

	public void setMovie(Movie movie){
		
		movieList.add(movie);
	}
	
	public Movie getMovie(int movieId){
		
//		ArrayList<Movie> movieList= new ArrayList<Movie>();
		
		for (Movie movie : movieList){
			
			if (movie.getId() == movieId){
				
				return movie;
				
			}
		}
		
		return new Movie(); 
	}
	
	
	public boolean isParentPreference(int movieId, Classification classification){
		
	
		Movie movieToWatch = getMovie(movieId);
		
		if(movieToWatch.getId() !=0 && classification.ordinal() >= movieToWatch.recommentedClassification.ordinal()){
			return true;
		}
		
		
		return false;
	}
}
