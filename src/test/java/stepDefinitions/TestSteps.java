package stepDefinitions;


import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import pageObjects.TestPageObj;

public class TestSteps extends Base{
	
	TestPageObj testpageobj = new TestPageObj();
	
	@Given("I am on test environment website")
	public void i_am_on_test_environment_website() {
		String exptctedText = "Desktops";
		String text = testpageobj.getDesktopText();
		Assert.assertEquals(exptctedText, text);
		System.out.println(text);
	    
	}


}
