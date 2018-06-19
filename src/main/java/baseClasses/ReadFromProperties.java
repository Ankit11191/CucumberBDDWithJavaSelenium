package baseClasses;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

public class ReadFromProperties {

	public static Properties properties=new Properties();
	public static Properties reading(String BaseClasses)
	{
		URL url=new Object() { }.getClass().getClassLoader().getResource(BaseClasses);
		try {
			File file= new File(url.toURI());
			String[] filesinDir = file.list();
		if(filesinDir !=null)
		{
			String filename="";
			for(int i=0;i<filesinDir.length;i++)
			{
				filename=filesinDir[i];
				if(!filename.contains("."))
				{
					System.out.println(BaseClasses+File.separator+filename);
					reading(BaseClasses+File.separator+filename);
				}
				else if (filename.endsWith(".properties")) 
				{
						properties.load(new FileInputStream(file+File.separator+filename));	
				}
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}
	public static String[] PageElementValue(String ElemantName)
	{
		return reading("\\PageElements").getProperty(ElemantName).split("=",2);
	}
	
	public static void main(String[] args) {
		String[] pageElementValue = ReadFromProperties.PageElementValue("username1");
		for(String arg: pageElementValue)
		{
			System.out.println(arg);
		}
	}
}