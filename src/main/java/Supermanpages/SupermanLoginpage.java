package Supermanpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SupermanLoginpage {

	
	WebDriver driver;
	
	
	By oneloginBtn  = By.xpath("//*[text()=\"Access using OneLogin\"]");
	By username = By.xpath("//*[@class=\"sc-VigVT gCiims\"]");
	By ContBtn =  By.xpath("//*[@type=\"submit\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By contBtn2 = By.xpath("//*[@type=\"submit\"]");
	By NotnowBtn = By.xpath("(//*[@type=\"button\"])[1]");
	By username1 = By.xpath("//*[@class=\"sc-VigVT gCiims\"]");
	By ContBtn3 =  By.xpath("//*[@type=\"submit\"]");
	By password1 = By.xpath("//*[@id=\"password\"]");
	By ContBtn4 = By.xpath("//*[@type=\"submit\"]");
	
	
	
//	By planandmeetBtn = By.xpath("//div[contains(text(),'Plan & Meet')]");
	//By planandmeetBtn = By.xpath("//div[contains(@data-testid, 'label_Plan & Meet')]");
	//div[contains(@data-testid, 'label_Plan & Meet')]
	//By plan2 = By.xpath("//*[contains(@data-testid, 'label_Plan & Meet')]");
	
	public SupermanLoginpage(WebDriver driver) {
		this.driver= driver;
	}

	
	
	public void oneloginBtn(String arg1)
	{
		driver.findElement(oneloginBtn).click();
	}
	

	public void username(String arg1)
	{
		driver.findElement(username).sendKeys(arg1);
	}

	public void ContBtn3()
	{
		driver.findElement(ContBtn3).click();
	}
	
	public void password1(String arg1)
	{
		driver.findElement(password1).sendKeys(arg1);
	}
	
	public void ContBtn2()
	{
		driver.findElement(contBtn2).click();
	
	}
	
	public void NotnowBtn()
	{
		driver.findElement(NotnowBtn).click();
	
	}
	
	
	public void username1(String arg1)
	{
		driver.findElement(username1).sendKeys(arg1);
	}

	public void ContBtn()
	{
		driver.findElement(ContBtn).click();
	}
	
	public void password(String arg1)
	{
		driver.findElement(password).sendKeys(arg1);
	}
	
	public void ContBtn4()
	{
		driver.findElement(ContBtn4).click();
	
	}
	
	
}

