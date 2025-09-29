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
public PlanNmeet(WebDriver driver) {
	this.driver= driver;
}
	
By dcrBtn =  By.xpath("//*[text()=\"Review DCR\"]");
By calBtn =  By.xpath("//*[@data-testid=\"showCalendar\"]");
By date =  By.xpath("(//*[text()=\"3\"])[1]");
By adhoccall =By.xpath("//*[@data-testid=\"Add_Parties_Plus_Icon\"]");
By Searchypartydoctor = By.xpath("//*[@placeholder=\"Search Customer\"]");
By Searchparty = By.xpath("//*[@placeholder=\"Search Customer\"]");
By Selectsearchparty = By.xpath("//*[text()=\"Amit Kumar Saha/Physician/Nf Railway Central Hospital, Maligaon(Inst- Guwahati)\"]");
By Go = By.xpath("(//*[text()=\"Go\"])[1]");
By Doctorcard = By.xpath("//*[text()=\"Dr. Amit Kumar Saha\"]");
By Rightarrow =By.xpath("//*[text()=\"\"]");
By Disscussedproduct = By.xpath("//*[text()=\"Comfypen\"]");
By Subbrand = By.xpath("//*[text()=\"Comfypen Reusable Insulin Pen\"]");
By Donebtn = By.xpath("(//*[text()=\"Done\"])[2]");
By Noitemgiven = By.xpath("//*[text()=\"No Items Given\"]");
By Dmsbtn = By.xpath("//*[text()=\"Division Mkt. Share is zero\"]");
By Done =By.xpath("//*[text()=\"Done\"]");

//By Nfa = By.xpath("//*[@class=\"css-901oao css-bfa6kz r-1kl4wzp r-13awgt0 r-9d1ssk r-1b43r93 r-oxtfae r-rjixqe\"]");
By Nfa = By.xpath("//*[text()=\"Select item\"]");
By Transit = By.xpath("//*[text()=\"Transit\"]");
By Gobtn = By.xpath("(//*[text()=\"Go\"])[2]");
By Location = By.xpath("(//*[@autocapitalize=\"sentences\"])[2]");
By Locationsearch = By.xpath("(//*[@autocapitalize=\"sentences\"])[2]");
By Remarks = By.xpath("//*[@data-testid=\"anyOtherReason\"]");
By Confirmbtn = By.xpath("//*[text()=\"Confirm\"]");
By SubmitBtn =By.xpath("//*[text()=\"Submit\"]");
By SubmitBt =By.xpath("(//*[text()=\"Submit\"])[2]");
//By CalculateBtn = By.xpath("//*[@data-testid=\"expense-Calculate-button\"]");
By SaveBtn = By.xpath("//*[text()=\"Save\"]");
By Closeicon =By.xpath("//*[@testID=\"expense-modal-closeIcon\"]");
By Dashboard =By.xpath("//*[text()=\"FLM KPI\"]");
By CrossBtn =By.xpath("//*[@class=\"css-901oao r-q45uyb\"]");
By Chemist = By.xpath("//*[text()=\"Chemist (528)\"]");
By Stockist = By.xpath("//*[text()=\"Stockist (17)\"]");
By Ho = By.xpath("//*[text()=\"HO (1)\"]");
By Brandview = By.xpath("//*[text()=\"Brand View\"]");
By Monthlyview = By.xpath("//*[text()=\"Monthly Aspiration View\"]");
By Dashboardgsp = By.xpath("//*[text()=\"Dashboard\"]");
By Selectall = By.xpath("//*[text()=\"Select All\"]");
By ImportDcr = By.xpath("//*[text()=\"Import DCR\"]");








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

public void adhoccall()
{
	driver.findElement(adhoccall).click();

}


public void Searchypartydoctor()
{
	driver.findElement(Searchypartydoctor).click();

}

public void Searchparty(String arg1)
{
	driver.findElement(Searchparty).sendKeys(arg1);

}

public void Selectsearchparty()
{
	driver.findElement(Selectsearchparty).click();

}

public void Go()
{
	driver.findElement(Go).click();

}

public void Doctorcard()
{
	driver.findElement(Doctorcard).click();

}

public void Rightarrow()
{
	driver.findElement(Rightarrow).click();

}

public void Disscussedproduct()
{
	driver.findElement(Disscussedproduct).click();

}


public void Subbrand()
{
	driver.findElement(Subbrand).click();

}

public void Donebtn()
{
	driver.findElement(Donebtn).click();

}



public void Noitemgiven()
{
	driver.findElement(Noitemgiven).click();

}


public void Dmsbtn()
{
	driver.findElement(Dmsbtn).click();

}


public void Done()
{
	driver.findElement(Done).click();

}

public void Nfa()
{
	driver.findElement(Nfa).click();

}

public void Transit()
{
	driver.findElement(Transit).click();

}

public void Gobtn()
{
	driver.findElement(Gobtn).click();

}

public void Location()
{
	driver.findElement(Location).click();

}

public void Locationsearch(String arg1)
{
	driver.findElement(Locationsearch).sendKeys(arg1);

}



public void Remarks(String arg1)
{
	driver.findElement(Remarks).sendKeys(arg1);

}

public void Confirmbtn()
{
	driver.findElement(Confirmbtn).click();

}

public void SubmitBtn()
{
	driver.findElement(SubmitBtn).click();

}


public void SubmitBt()
{
	driver.findElement(SubmitBt).click();

}

/*
public void CalculateBtn()
{
	driver.findElement(CalculateBtn).click();

}



public void SaveBtn()
{
	driver.findElement(SaveBtn).click();

}

*/


public void Closeicon()
{
	driver.findElement(Closeicon).click();

}

public void Dashboard()
{
	driver.findElement(Dashboard).click();

}


public void CrossBtn()
{
	driver.findElement(CrossBtn).click();

}


public void Chemist()
{
	driver.findElement(Chemist).click();

}

public void Stockist()
{
	driver.findElement(Stockist).click();

}


public void Ho()
{
	driver.findElement(Ho).click();

}


public void Brandview()
{
	driver.findElement(Brandview).click();

}

public void Monthlyview()
{
	driver.findElement(Monthlyview).click();

}

public void Dashboardgsp()
{
	driver.findElement(Dashboardgsp).click();

}

public void Selectall()
{
	driver.findElement(Selectall).click();

}

public void ImportDcr()
{
	driver.findElement(ImportDcr).click();

}


































}









	
	
	

	
	
	
	
	






	
	
	
	


