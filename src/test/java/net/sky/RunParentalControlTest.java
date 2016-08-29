package net.sky;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class RunParentalControlTest {

	ArrayList<Movie> movies;
	Movie movie1 ;
	Movie movie2 ;
	ParentalControlService controlService;
	Customer parent;
	
	/**
	 * 
	 * @param args
	 * 
	 */
	
	@Before
	public  void setup() {
		movies= new ArrayList<Movie>();
		movie1 = new Movie();
		movie2 = new Movie();
		parent = new Customer();
		controlService = new ParentalControlService(movies);
		movie1.setRecommentedClassification(Classification.babies);
		movie1.setId(5);
		movies.add(movie1);
		movie2.setRecommentedClassification(Classification.Adults);
		movie2.setId(69);
		movies.add(movie2);
		parent.setClassification(Classification.kids);
		controlService.setMovie(movie1);
		controlService.setMovie(movie2);
		
		
		
	}
	
	@Test
	public void testcontrolBabyMovie(){
		//"test baby movie when parent has kids preference"
		Assert.assertTrue( controlService.isParentPreference(5, parent.getClassification()));
		
	}
	
	@Test
	public void testcontrolAdultMovie(){
	
		//"test adult movie when parents has kids preference"
		Assert.assertFalse( controlService.isParentPreference(69, parent.getClassification()));
		
	}
	
	
}
