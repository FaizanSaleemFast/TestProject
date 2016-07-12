import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.*;

public class TrackingServiceTests {

	private TrackingService service;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before");
		service = new TrackingService();
	}
	
	@Test
	@Category({GoodTestsCategory.class, BadTestsCategory.class})
	public void TrackingServiceTotalIsNotZero() {
		Assert.assertEquals("Tracking service total was not zero", 0, service.getTotal());
		Assert.assertThat("Tracking service total was not zero", service.getTotal(), is(0));
	}

	@Test
	@Category(BadTestsCategory.class)
	public void TrackingServiceHistoryIsEmpty() {
		Assert.assertEquals("Tracking service history was empty", 0, service.getHistory().size());
	}
	
	@After
	public void tearDown() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	
}
