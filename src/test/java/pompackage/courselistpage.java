package pompackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class courselistpage {
	//declaration
	@FindBy(xpath="")
	private WebElement pageHeader;
	@FindBy(xpath="")
	private WebElement newButton;
	@FindBy(xpath="")
	private List<WebElement> courseList;
	//initialization
	public courselistpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickNewButton() {
		newButton.click();
	}
	public List<WebElement> getCourseList(){
		return courseList;
	}
	public String getSuccessMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
