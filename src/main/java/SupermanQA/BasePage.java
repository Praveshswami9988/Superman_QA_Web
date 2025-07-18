package SupermanQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	
	public void driverInvoke()
	{
		String path="E:\\PRAVESH PC\\AUTOMATION SOFTWARE\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
	}
	
	
	
	
}
