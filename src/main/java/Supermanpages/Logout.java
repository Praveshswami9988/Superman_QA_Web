package Supermanpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.*;


public class Logout {
	
	
	WebDriver driver;
	public Logout(WebDriver driver) {
		this.driver= driver;
	}
	
	
	By OkBtn =  By.xpath("//*[text()=\"Ok\"]");
	
	
	
	
	
	
	
	
	public void OkBtn()
	{
		driver.findElement(OkBtn).click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
