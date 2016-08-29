/**
 * 
 */
package net.sky;




import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.sun.javafx.cursor.CursorType;

/**
 * @author Bruno Serralheiro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TestParentalControl {

	/**
	 * 
	 */
	
	private ParentalControlService parentalControlService;
	private Movie movie;
	private Customer parent;
	private int movieId;
	public TestParentalControl() {
		// TODO Auto-generated constructor stub
	}

	@Before
	public void setUp(){
		
		parentalControlService = Mockito.mock(ParentalControlService.class);
		movie= Mockito.mock(Movie.class);
		parent = Mockito.mock(Customer.class);
		movieId = 0;
		
	}
	
	@Test
	public void test(){
		
//		Assert.assertTrue(parentalControlService.isParentPreference(movieId, parent.getClassification()));
		Assert.assertFalse(parentalControlService.isParentPreference(movieId, parent.getClassification()));
		
		// assert statements
//        assertEquals(true, 0, parentalControlService.isParentPreference(movieId, classification));
		
		
	}
	
	
	
}

