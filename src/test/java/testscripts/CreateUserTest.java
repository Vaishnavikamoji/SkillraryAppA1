package testscripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateUserTest extends baseclass {
	@Test
	public void createUserTest() {
		SoftAssert soft = new SoftAssert();
		home.clickUserTab();
		soft.assertTrue(Users.getPageHeader().contains("Users"));
		users.clickNewButton();
		soft.assertEquals(addUsers.getPageHeader(),"Add New Users"));
		Map<String,String> map = excel.readFromExcel("Sheet1","Add User");
		addUser.createNewUser(map.get("Email"),map.get("Password")),map.get("Firstname"),map.get("Lastname"),map.get("Address"),
		map.get("Contact Info"),map.get("Photo"));
		soft.assertTrue(users.getSuccessMessage().contains("Success"));
		if(course.getSuccessMessage().contains("Success"))excel.writeToExcel("Sheet1","Add User","Pass",IConstantPath.EXCEL-PATH);
		else
			excel.writeToExcel("Sheet1","Add User","Fail",IConstantPath.EXCEL-PATH);
		soft.assertAll();

			
		
	}

}
