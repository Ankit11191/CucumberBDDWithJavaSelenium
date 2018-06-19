package BDDFrameWork.StepDefination;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

import baseClasses.DriverLaunch;
import baseClasses.FindElement;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchPage {

	
	JavascriptExecutor js= (JavascriptExecutor) DriverLaunch.driverReturn();

	@Given("^launch \"([^\"]*)\"$")
	public void launch(String URL) {
		DriverLaunch.Launch(URL);
	}
	
	@When("^Provide User Name and Passwrord$")
	public void Provide_userName_and_password(DataTable dealData)// String UN, String UNE, String pwd, String pwdE)
	{
		List<List<String>> dealValues =  dealData.raw();
		FindElement.sendKeys(dealValues.get(0).get(2),dealValues.get(0).get(0));
		FindElement.sendKeys(dealValues.get(0).get(3),dealValues.get(0).get(1));
	}

	@Then("^Click on Button \"([^\"]*)\"$")
	public void Click_On_Button(String ButtonElement)
	{
		FindElement.Click(ButtonElement);
		DriverLaunch.driverQuit();
	}
}
