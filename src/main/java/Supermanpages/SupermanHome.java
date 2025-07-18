package Supermanpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SupermanHome {

	WebDriver driver;
	
	By SearchBtn = By.xpath("//*[@class=\"css-1dbjc4n r-1loqt21 r-4kfk9g r-6dt33c r-1otgn73 r-1i6wzkk r-lrvibr r-v117v2\"]");
	By NotificationBtn = By.xpath("//*[@data-testid=\"testIdHandleNotificationIconClick\"]"); 	
	
	
	public SupermanHome(WebDriver driver) {
		this.driver= driver;
	}

	
	public void SearchBtn()
	{
		driver.findElement(SearchBtn).click();
	}
	
	public void NotificationBtn()
	{
		driver.findElement(NotificationBtn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
