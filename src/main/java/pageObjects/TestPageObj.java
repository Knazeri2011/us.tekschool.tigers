package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TestPageObj extends Base{
	
	public TestPageObj() {
		PageFactory.initElements(driver, this);
	}
	//FindBy is same as driver.findElement(By.linkText("xpath"));
	@FindBy(linkText = "Desktops")
	private WebElement text;
	
	public String getDesktopText() {
		String textFromUI = text.getText();
		return textFromUI;
	}

}
