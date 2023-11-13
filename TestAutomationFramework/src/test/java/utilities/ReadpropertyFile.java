package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties; 

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("F:\\Academics\\L4\\S1\\IS3440 - IT Quality Assurance\\Group Assignment\\Assignment Workspace\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		
		p.load(fr);
		
		System.out.println(p.getProperty("browser")); 
		System.out.println(p.getProperty("testurl"));
	}

}
