package testscripts;

import java.util.List;
import java.util.Map;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlibraries.baseclass;

public class CreateCourseTest extends baseclass  {
	@Test
	public void createCourseTest() {
		home.clickCourseListLink();
		home.clickCourseListLink();
		course.clickNewButton();
		Map<String,String> map = excel.readFromExcel("Sheet1","Add Course");
		String courseName = map.get("Name")+jutil.generateRandomNum(100);
		addCourse.setName(courseName);
		addCourse.selectCategory(webUtil,map.get("Category"));
		addCourse.setPrice(map.get("Price"));
		addCourse.uploadPhoto(map.get("Photo"));
		addCourse.setDescription(webUtil,map.get("Description"));
		addCourse.clickSaveButton();
		soft.assertTrue(course.getSuccessMessage().contains("Success"));
		boolean isPresent = false;
		List<WebElement> courseNameList = course.getCourseList();
		for (WebElement name : courseNameList) {
			if(name.getText().equals(courseName)) {
				isPresent = true;
				break;
			
		}
		soft.assertTrue(isPresent);
		course.clickDeleteButton(courseName,driver);
		course.clickDelete();
		soft.assertTrue(course.getSuccessMessage().contains("Success"));
		if(course.getSuccessMessage().contains("Success"))excel.writeToExcel("Sheet1","Add Course","Pass",IConstantPath.EXCEL-PATH);
		else
			excel.writeToExcel("Sheet1","Add Course","Pass",IConstantPath.EXCEL-PATH);
		soft.assertAll();
		

		
	}
			
		
	

}
