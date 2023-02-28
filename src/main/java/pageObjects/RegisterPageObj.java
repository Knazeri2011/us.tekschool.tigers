package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class RegisterPageObj extends Base{
	//once we reach to this step we create our constructor
	public RegisterPageObj() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Register']")
    private WebElement registerLink;
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	@FindBy(id = "input-email")
	private WebElement emailField;
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	@FindBy(id = "input-password")
	private WebElement passwordField;
	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;
	@FindBy(xpath = "//input[@value='1'and @name='newsletter']")
	private WebElement yesNewsLetter;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;
	//now we write our methods we know what data we entering that's why we need separate methods
	//we need to pass the locators, so that is why we need separate method for each input data value
	//first of first lets click on register link
	
	public void clickOnRigisterLink () {
		registerLink.click();//we can use the reference(registerLink)
	}
	//then we create method for senKyes, we can pass String firstName and same in send keys it refer to 
	public void enterFirstName(String firstname) { //cucumber data table (we have it there)
		firstNameField.sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		lastNameField.sendKeys(lastname);
	}
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	public void enterTelephone(String telephone) {
		telephoneField.sendKeys(telephone);
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void enterconfirmPassword(String confirmPass) {
		confirmPasswordField.sendKeys(confirmPass);
	}
	public void clickOnYesRadioBttn() {
		Utils.clickOnRadioButton(yesNewsLetter);
	}
	public void clickOnPrivacyPolicyCheckBox() {
		Utils.clickOnCheckBoxButton(privacyPolicyCheckBox);
	}
	public void clickOnContinueBttn() {
		continueButton.click();
	}
	public String getAccountCreatedMssgFromUI() {
		String actualMessage = accountCreatedMessage.getText();
		return actualMessage;
	}
	

}
