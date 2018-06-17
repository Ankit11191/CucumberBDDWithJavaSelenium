package BDDFrameWork.StepDefination;

import org.openqa.selenium.JavascriptExecutor;

import baseClasses.DriverLaunch;
import baseClasses.FindElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchPage {

	
	JavascriptExecutor js= (JavascriptExecutor) DriverLaunch.driverReturn();

	@Given("^launch \"([^\"]*)\"$")
	public void launch(String URL) {
		DriverLaunch.Launch(URL);
	}
	
	@When("^Provide \"([^\"]*)\" at User Name Field \"([^\"]*)\" and \"([^\"]*)\" at Passwrord Field \"([^\"]*)\"$")
	public void Provide_userName_and_password(String UN, String UNE, String pwd, String pwdE)
	{
		FindElement.sendKeys(UNE,UN);
		FindElement.sendKeys(pwdE,pwd);
	}

	@Then("^Click on Button \"([^\"]*)\"$")
	public void Click_On_Button(String ButtonElement)
	{
		FindElement.Click(ButtonElement);
		DriverLaunch.driverQuit();
	}
}
