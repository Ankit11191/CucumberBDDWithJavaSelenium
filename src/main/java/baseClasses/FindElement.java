package baseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FindElement {
	
	static WebElement webelement;
	private static WebElement elementType(String[] element)
	{
		String elementvalue=element[1];
		switch(element[0].toLowerCase())
		{
			case "id":
				webelement=DriverLaunch.driverReturn().findElement(By.id(elementvalue));
				break;
			case "name":
				webelement=DriverLaunch.driverReturn().findElement(By.name(elementvalue));
				break;
			case "xpath":
				webelement=DriverLaunch.driverReturn().findElement(By.xpath(elementvalue));
				break;
			case "cssselector":
				webelement=DriverLaunch.driverReturn().findElement(By.cssSelector(elementvalue));
				break;
			case "tagname":
				webelement=DriverLaunch.driverReturn().findElement(By.tagName(elementvalue));
				break;
			case "classname":
				webelement=DriverLaunch.driverReturn().findElement(By.className(elementvalue));
				break;
			case "linktext":
				webelement=DriverLaunch.driverReturn().findElement(By.linkText(elementvalue));
				break;
			case "partiallinktext":
				webelement=DriverLaunch.driverReturn().findElement(By.partialLinkText(elementvalue));
				break;
		}
		return webelement;
	}

	public static void Click(String element)
	{
		JavascriptExecutor js= (JavascriptExecutor) DriverLaunch.driverReturn();
		js.executeScript("arguments[0].click();", FindElement.elementType(ReadFromProperties.PageElementValue(element)));
		//FindElement.elementType(ReadFromProperties.PageElementValue(element)).click();
	}
	public static void sendKeys(String element, String Value)
	{
		FindElement.elementType(ReadFromProperties.PageElementValue(element)).sendKeys(Value);
	}
	
	public static WebElement webElement(String element)
	{
		return FindElement.elementType(ReadFromProperties.PageElementValue(element));
	}
}
