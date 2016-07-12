import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({HelloJUnitTest.class, TrackingServiceTests.class})
@IncludeCategory({GoodTestsCategory.class})
public class TackingServiceTestsSuite {

}
