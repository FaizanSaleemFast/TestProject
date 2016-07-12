import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ParameterizedTests {

	
	private static TrackingService service = new TrackingService();
	
	private int expected;
	private int actual;


	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{5,5},
			{5,10},
			{-1,9},
			{-12,0},
			{50,50}
		});
	}
	
	
	public ParameterizedTests(int actual, int expected) {
 		this.actual = actual;
		this.expected = expected;
	}

	@Test
	public void test() {
		if(actual >= 0)
			service.addProtein(actual);
		else
			service.removeProtein(-actual);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void test1() {
		if(actual <= 0)
			service.addProtein(actual);
		else
			service.removeProtein(-actual);
		
		Assert.assertEquals(expected, actual);
		
	}
	
}
