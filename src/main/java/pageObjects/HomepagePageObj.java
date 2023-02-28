package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class HomepagePageObj extends Base{
	
	//here we create our constructor at this line over all we locate the elements at this class.
	public HomepagePageObj() {
		PageFactory.initElements(driver, this);//PageFactroy is a class
	}
	//we locate the elements and store them in webElement
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopLink;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNoteboolsLink;
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement componentsLink;
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tabletsLink;
	@FindBy(xpath = "//a[text()='Software']")
	private WebElement softwareLink;
	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesAndPADsLink;
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement camerasLink;
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3PlayersLink;
	
	//now we need method to validate each field we can write one method and reused or we can 
	//write methods separately for each field
	public void compareTextDesktopLink(String expextedText) {
		String actualText = Utils.getTextFromUI(desktopLink);
		Assert.assertEquals(expextedText, actualText);
	}
	public void compareTextlaptopsAndNoteboolsLink(String expextedText) {
		String actualText = Utils.getTextFromUI(laptopsAndNoteboolsLink);
		Assert.assertEquals(expextedText, actualText);
	}
	public void compareTextcomponentsLink(String expextedText) {
		String actualText = Utils.getTextFromUI(componentsLink);
		Assert.assertEquals(expextedText, actualText);
	}
	public void compareTexttabletsLink(String expextedText) {
		String actualText = Utils.getTextFromUI(tabletsLink);
		Assert.assertEquals(expextedText, actualText);
	}
	public void compareTextsoftwareLink(String expextedText) {
		String actualText = Utils.getTextFromUI(softwareLink);
		Assert.assertEquals(expextedText, actualText);
	}
	public void compareTextphonesAndPADsLink(String expextedText) {
		String actualText = Utils.getTextFromUI(phonesAndPADsLink);
		Assert.assertEquals(expextedText, actualText);
	}
	public void compareTextcamerasLink(String expextedText) {
		String actualText = Utils.getTextFromUI(camerasLink);
		Assert.assertEquals(expextedText, actualText);
	}
	public void compareTextmp3PlayersLink(String expextedText) {
		String actualText = Utils.getTextFromUI(mp3PlayersLink);
		Assert.assertEquals(expextedText, actualText);
	}

}
