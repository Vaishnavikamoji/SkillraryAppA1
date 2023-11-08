package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateCategoryTest extends baseclass {
	@Test
	public void CreateCategoryTest() {
		SoftAssert soft = new SoftAssert();
		home.clickCourseTab();
		home.clickCategoryLink();
		soft.assertAll(Category.getPageHeader().contains("Category"));
		
	}
	

}
