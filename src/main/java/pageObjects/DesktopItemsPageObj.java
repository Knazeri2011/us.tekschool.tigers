package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopItemsPageObj extends Base{
	
	public DesktopItemsPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Desktops']")
	private WebElement desktopLink;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDeskTopLink;
	@FindBy(xpath = "//div[@class='list-group']//a[6]")
	private WebElement tabletsTab;
	
	public void hoverMouseOverElement() {
		Actions actions = new Actions(driver);
		actions.moveToElement(desktopLink);
	}
	public void clickOnDesktopLink() {
		desktopLink.click();
	}
	public String getShowAllDesktopText() {
		String showAllDesktopText = showAllDeskTopLink.getText();
		return showAllDesktopText;
	}
	public void clickOnShowAllDesktopLink() {
		showAllDeskTopLink.click();
	}
	public String getTabletsTextFromUI() {
		String tabletsTextFromUI = tabletsTab.getText();
		String text = tabletsTextFromUI.substring(0, 7);
		return text;
	    
	}

}
