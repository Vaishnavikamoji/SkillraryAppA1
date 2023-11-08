package pompackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class categorypage {
	//Declaration
	@FindBy(xpath = "")
	private WebElement pageHeader;
	@FindBy(xpath="")
	private WebElement newButton;
	@FindBy(xpath="")
	private List<WebElement>categoryList;
	private String deletePath = ;
	@FindBy(xpath = "")
	private WebElement successMessage;
	@FindBy(xpath ="")
	private WebElement deleteButton;
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public void clickNewButton() {
		newButton.click();
	}
	public List<WebElement> getCategoryList(){
		return categoryList;
	}
	public String getSuccessMessage() {
		return successMessage.getText();
	}
	public void clickDeleteButton(String courseName,WebDriver driver) {
		String requiredPath = String.format(deletePath, courseName);
		driver.findElement(By.xpath(requiredPath)).click();
	}
	public void clickDelete() {
		deleteButton.click();
		
	}
	
	

}
