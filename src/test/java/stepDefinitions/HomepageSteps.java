package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import pageObjects.HomepagePageObj;

public class HomepageSteps extends Base{
	//we can create an object of our homePage
	HomepagePageObj homepagepageobj = new HomepagePageObj();//now we need to get our method or stepdivi
	

	@Then("i validate Desktops {string} on the UI")
	public void i_validate_desktops_on_the_ui(String desktops) {
		homepagepageobj.compareTextDesktopLink(desktops);
		logger.info("Text for " + desktops + " verified successfully");
	}

	@Then("i validate Laptops & Notebooks {string} on the UI")
	public void i_validate_laptops_notebooks_on_the_ui(String laptopsAndNotebooks) {
		homepagepageobj.compareTextlaptopsAndNoteboolsLink(laptopsAndNotebooks);
		logger.info("Text for " + laptopsAndNotebooks + " verified successfully");
	}

	@Then("i validate Components {string} on the UI")
	public void i_validate_components_on_the_ui(String components) {
		homepagepageobj.compareTextcomponentsLink(components);
		logger.info("Text for " + components + " verified successfully");
	}

	@Then("i validate Tablets {string} on the UI")
	public void i_validate_tablets_on_the_ui(String tablets) {
		homepagepageobj.compareTexttabletsLink(tablets);
		logger.info("Text for " + tablets + " verified successfully");
	}

	@Then("i validate Software {string} on the UI")
	public void i_validate_software_on_the_ui(String software) {
		homepagepageobj.compareTextsoftwareLink(software);
		logger.info("Text for " + software + " verified successfully");
	}

	@Then("i validate Phones & PDAs {string} on the UI")
	public void i_validate_phones_pd_as_on_the_ui(String phonesAndPDAs) {
		homepagepageobj.compareTextphonesAndPADsLink(phonesAndPDAs);
		logger.info("Text for " + phonesAndPDAs + " verified successfully");
	}

	@Then("i validate Cameras {string} on the UI")
	public void i_validate_cameras_on_the_ui(String cameras) {
		homepagepageobj.compareTextcamerasLink(cameras);
		logger.info("Text for " + cameras + " verified successfully");
	}

	@Then("i validate MP3 Players {string} on the UI")
	public void i_validate_mp3_players_on_the_ui(String mP3Players) {
		homepagepageobj.compareTextmp3PlayersLink(mP3Players);
		logger.info("Text for " + mP3Players + " verified successfully");  
	}


}
