package baseClasses;

import org.openqa.selenium.By;
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
			case "name":
				webelement=DriverLaunch.driverReturn().findElement(By.name(elementvalue));
			case "xpath":
				webelement=DriverLaunch.driverReturn().findElement(By.xpath(elementvalue));
			case "cssselector":
				webelement=DriverLaunch.driverReturn().findElement(By.cssSelector(elementvalue));
			case "tagname":
				webelement=DriverLaunch.driverReturn().findElement(By.tagName(elementvalue));
			case "classname":
				webelement=DriverLaunch.driverReturn().findElement(By.className(elementvalue));
			case "linktext":
				webelement=DriverLaunch.driverReturn().findElement(By.linkText(elementvalue));
			case "partiallinktext":
				webelement=DriverLaunch.driverReturn().findElement(By.partialLinkText(elementvalue));
		}
		return webelement;
	}

	public static void Click(String element)
	{
		String[] elementValues = ReadFromProperties.PageElementValue(element);
		FindElement.elementType(elementValues).click();
	}
	public static void sendKeys(String element, String Value)
	{
		System.out.println(element);
		String[] elementValues = ReadFromProperties.PageElementValue(element);
		FindElement.elementType(elementValues).sendKeys(Value);
	}
	

}
