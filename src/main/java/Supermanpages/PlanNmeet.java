package Supermanpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.*;
public class PlanNmeet {
	
	
WebDriver driver;
	
By dcrBtn =  By.xpath("//*[text()=\"Review DCR\"]");
By calBtn =  By.xpath("//*[@data-testid=\"showCalendar\"]");
By date =  By.xpath("//*[@data-testid=\"native.calendar.SELECT_DATE_SLOT-2025-06-05\"]");
By doctor =  By.xpath("//*[@class=\"css-1dbjc4n r-uia4a0 r-1habvwh r-1kihuf0 r-13awgt0 r-eqz5dr r-1h0z5md r-qiwf3y\"])[1]");
By slide2 =  By.xpath("(//*[@data-testid=\"OTHER_PRODUCT\"])[1]");
By slide3 =  By.xpath("(//*[@data-testid=\"ITEM_CHECKED\"])[1]");
By slide4 =  By.xpath("//*[@data-testid =\"eDetail-done\"]");
By slide5 =  By.xpath("//*[text()=\"No Sample Given\"]");
By dropdownBtn =  By.xpath("//*[@data-testid=\"ACCORDION\"]");
By slide6 =  By.xpath("//*[text()=\"No Items Given\"]");
By slide8 =  By.xpath("//*[text()=\"Division Mkt. Share is zero\"]");
By slide9 =  By.xpath("//*[@data-testid=\"DONE-button\"]");
By slide10 =  By.xpath("(//*[text()=\"Submit\"])[2]");
By slide11 =  By.xpath("//*[text()=\"Calculate\"]");
By slide12 =  By.xpath("//*[text() =\"Save\"]");


public void dcrBtn()
{
	driver.findElement(dcrBtn).click();

}

public void calBtn()
{
	driver.findElement(calBtn).click();

}

public void date()
{
	driver.findElement(date).click();

}

public void doctor()
{
	driver.findElement(doctor).click();

}

public void slide2()
{
	driver.findElement(slide2).click();

}

public void slide3()
{
	driver.findElement(slide3).click();

}

public void slide4()
{
	driver.findElement(slide4).click();

}

public void slide5()
{
	driver.findElement(slide5).click();

}

public void dropdownBtn()
{
	driver.findElement(dropdownBtn).click();

}
	      
public void slide6()
{
	driver.findElement(slide6).click();

}
     
public void slide8()
{
	driver.findElement(slide8).click();

}

public void slide9()
{
	driver.findElement(slide9).click();

}

public void slide10()
{
	driver.findElement(slide10).click();

}

public void slide11()
{
	driver.findElement(slide11).click();

}

public void slide12()
{
	driver.findElement(slide12).click();

}

 























}









	
	
	

	
	
	
	
	






	
	
	
	


