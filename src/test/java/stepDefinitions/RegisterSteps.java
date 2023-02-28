package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pageObjects.RegisterPageObj;
import utilities.Utils;

public class RegisterSteps extends Base {
	// at stepDefinitons class we create object of our page object class and create
	// an object of
	// our register page object so that we can access the methods, we use the class
	// name
	RegisterPageObj  registerPagrObj = new RegisterPageObj();
	

	@Then("i click on register link")
	public void i_click_on_register_link() {
		registerPagrObj.clickOnRigisterLink();
		logger.info("Register link was clicked successfully");
	}

	@Then("i fill registrsation form")
	public void i_fill_registrsation_form(DataTable dataTable) {
		//we have store the data in list of map
		//list will define the row and map will define the column
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		registerPagrObj.enterFirstName(data.get(0).get("firstname"));
		registerPagrObj.enterLastName(data.get(0).get("lastname"));
		registerPagrObj.enterEmail(data.get(0).get("email"));
		registerPagrObj.enterTelephone(data.get(0).get("telephone"));
		registerPagrObj.enterPassword(data.get(0).get("password"));
		registerPagrObj.enterconfirmPassword(data.get(0).get("confirmPassword"));
		Utils.takeScreenshotForStep();
		logger.info("Registeration from is filled-out successfully");
		
	
	}

	@Then("i subscribe to newssletter")
	public void i_subscribe_to_newssletter() {
		registerPagrObj.clickOnYesRadioBttn();
		logger.info("Yes for newsletter was clicked successfully");
	}

	@Then("i agree to privacy policy")
	public void i_agree_to_privacy_policy() {
		registerPagrObj.clickOnPrivacyPolicyCheckBox();
		logger.info("check box for privacy policy was clicked successfully");
	}

	@Then("i click on continue button")
	public void i_click_on_continue_button() {
		registerPagrObj.clickOnContinueBttn();
		logger.info("Continue button was clicked successfully");
		
	}

	@Then("i validate my account is created successfully")
	public void i_validate_my_account_is_created_successfully() {
		String expectedMessage = "Your Account Has Been Created!";
		String actualMessage = registerPagrObj.getAccountCreatedMssgFromUI();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("Expected & Actual Text was verified successfully");
	}

}
