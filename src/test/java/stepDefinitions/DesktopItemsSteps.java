package stepDefinitions;

import org.testng.Assert;

import core.Base;
import io.cucumber.java.en.*;
import pageObjects.DesktopItemsPageObj;

public class DesktopItemsSteps extends Base{
	
	DesktopItemsPageObj desktoppageobj = new DesktopItemsPageObj();
	
	@When("i hover my mouse over desktop dropdown")
	public void i_hover_my_mouse_over_desktop_dropdown() {
		desktoppageobj.clickOnDesktopLink();
		logger.info("Mouse was moved to Destop Link Successfully");
	}

	@Then("i see show all desktops link")
	public void i_see_show_all_desktops_link() {
	   String expectedText = "Show All Desktops";
	   String actualText = desktoppageobj.getShowAllDesktopText();
	   System.out.println("Shoe All Desktops text from ui ===> " + actualText);
	   Assert.assertEquals(expectedText, actualText);
	   logger.info("Show All Desktop text was verified successfully");
	}

	@Then("i click on show all desktops link")
	public void i_click_on_show_all_desktops_link() {
		desktoppageobj.clickOnShowAllDesktopLink();
		logger.info("Show All Desktop link was clicked successfully");
	}

	@Then("i validate the Tablets tab on the UI")
	public void i_validate_the_tablets_tab_on_the_ui() {
	   String expectedText = "Tablets";
	   String actualText = desktoppageobj.getTabletsTextFromUI();
	   System.out.println("Tablets text printed ==> " + actualText);
	   Assert.assertEquals(expectedText, actualText);
	   logger.info("Tablets text was verified successfully");

}
}