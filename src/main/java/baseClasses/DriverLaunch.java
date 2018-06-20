package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLaunch {
	
	static WebDriver driver;
	public static void Launch(String URL)
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println(driver.getTitle());
	}
	
	public static void driverQuit()
	{
		driver.close();
		driver.quit();
	}
	
	
	public static WebDriver driverReturn()
	{
		return driver;
	}

}
