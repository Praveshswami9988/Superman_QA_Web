package Supermanpages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Admin {
	
	
	WebDriver driver;
	By InventoryBtn =  By.xpath("//*[text()=\"Inventory\"]");
	By PendingSample = By.xpath("//*[text()=\"Pending Sample\"]");
	By PendingItem = By.xpath("//*[text()=\"Pending Item\"]");
	By ReturnItem = By.xpath("//*[text()=\"Return Item\"]");
	By ReturnHistory = By.xpath("//*[text()=\"Return History\"]");
	By CreateReturn = By.xpath("//*[text()=\" Create Return for Resigned Subordinates \"]");
	By ApproveReturn = By.xpath("//*[text()=\"Approve Returned Items\"]");
	By ApproveOther = By.xpath("//*[text()=\"Approving for others\"]");
	By ChallanShort = By.xpath("//*[text()=\"Challan Short Qty Approval\"]");
	By BackBtn = By.xpath("//*[@id=\"prefix__icon_48_Move\"]");
	By LeaveBtn = By.xpath("//*[text()=\"Leave & Holiday\"]");
	By HolidayBtn = By.xpath("//*[text()=\"Holiday\"]");
	By BackBtn1 = By.xpath("(//*[@id=\"prefix__icon_48_Move\"])[2]");
	By MyemployeeBtn = By.xpath("//*[text()=\"My Employees\"]");
	By EmployeesleavesBtn = By.xpath("//*[text()=\"Employees Leaves\"]");
	By SelectuserBtn = By.xpath("//*[text()=\"Select\"]");
	By Selectbox = By.xpath("//*[@placeholder=\"Search under employee...\"]");
	By Selectbox1 = By.xpath("//*[text()=\"MANABJYOTI  TALUKDAR - 10024783 - GUWAHATI\"]");
	By BackBtn3 = By.xpath("(//*[@id=\"prefix__icon_48_Move\"])[1]");
	By ZhoBtn = By.xpath("//*[text()=\"ZHO\"]");
	By OrderBtn = By.xpath("//*[text()=\"Order\"]");
	By SummaryBtn = By.xpath("//*[text()=\"Summary\"]");
	By PendingpodBtn = By.xpath("//*[text()=\"Pending POD Submission\"]");
	By BackBtn4 = By.xpath("//*[@id=\"prefix__icon_48_Move\"]");
	By ExpenseBtn = By.xpath("//*[text()=\"Expense\"]");
	By SubmitexpenseBtn = By.xpath("//*[text()=\"Submit Expenses\"]");
	By SubmitexpensesBtn = By.xpath("//*[text()=\"Submit Expenses\"]");
	
	//By MissBtn = By.xpath("(//*[@class=\"css-901oao r-q45uyb r-1loqt21 r-9d1ssk r-1b43r93 r-10u4nep\"])[1]");
	//By MissBtn = By.xpath("//*[text()=\"Miscellaneous\"]");
	//By ExcepBtn = By.xpath("//*[text()=\"Exception Summary\"]");
	
	By BackBtn5 = By.xpath("(//*[@id=\"prefix__Path-3\"])[2]");
	By ApproveexpensesBtn = By.xpath("//*[text()=\"Approve Expenses\"]");
	By ReviewBtn = By.xpath("(//*[text()=\"Review\"])[1]");
	By ApproveBtn = By.xpath("//*[text()=\"Approve\"]");
	By CancelBtn = By.xpath("//*[text()=\"Cancel\"]");
	By BackBtn6 = By.xpath("(//*[@id=\"prefix__icon_48_Move\"])[3]");
	By BackBtn7 = By.xpath("(//*[@id=\"prefix__icon_48_Move\"])[2]");
	By ExpenseapprovedbyadminBtn = By.xpath("//*[text()=\"Expense Approved By Admin\"]");
	By ReporteeexpenseBtn = By.xpath("//*[text()=\"Reportees Expense\"]");
	By BackBtn8 = By.xpath("(//*[@id=\"prefix__icon_48_Move\"])[2]");
	By BackBtn9 = By.xpath("//*[@id=\"prefix__icon_48_Move\"]");
	
	
	
	
	
	
	public Admin(WebDriver driver) {
		this.driver= driver;
	}
	
	
	public void InventoryBtn()
	{
		driver.findElement(InventoryBtn).click();

	}

	public void PendingSample()
	{
		driver.findElement(PendingSample).click();

	}
	
	public void PendingItem()
	{
		driver.findElement(PendingItem).click();

	}
	
	public void ReturnItem()
	{
		driver.findElement(ReturnItem).click();

	}
	
	public void ReturnHistory()
	{
		driver.findElement(ReturnHistory).click();

	}
	
	public void CreateReturn()
	{
		driver.findElement(CreateReturn).click();

	}
	
	public void ApproveReturn()
	{
		driver.findElement(ApproveReturn).click();

	}
	
	public void ApproveOther()
	{
		driver.findElement(ApproveOther).click();

	}
	
	public void ChallanShort()
	{
		driver.findElement(ChallanShort).click();

	}
	
	public void BackBtn()
	{
		driver.findElement(BackBtn).click();

	}
	
	public void LeaveBtn()
	{
		driver.findElement(LeaveBtn).click();

	}
	
	public void HolidayBtn()
	{
		driver.findElement(HolidayBtn).click();

	}
	
	public void BackBtn1()
	{
		driver.findElement(BackBtn1).click();

	}
	
	public void MyemployeeBtn()
	{
		driver.findElement(MyemployeeBtn).click();

	}
	
	public void EmployeesleavesBtn()
	{
		driver.findElement(EmployeesleavesBtn).click();

	}
	
	public void SelectuserBtn()
	{
		driver.findElement(SelectuserBtn).click();

	}
	
	public void Selectbox(String arg1)
	{
		driver.findElement(Selectbox).sendKeys(arg1);

	}

	public void Selectbox1()
	{
		driver.findElement(Selectbox1).click();

	}
	
	public void BackBtn3()
	{
		driver.findElement(BackBtn3).click();

	}
	
	public void ZhoBtn()
	{
		driver.findElement(ZhoBtn).click();

	}
	
	public void OrderBtn()
	{
		driver.findElement(OrderBtn).click();

	}
	
	public void SummaryBtn()
	{
		driver.findElement(SummaryBtn).click();

	}
	
	public void PendingpodBtn()
	{
		driver.findElement(PendingpodBtn).click();

	}
	
	
	public void BackBtn4()
	{
		driver.findElement(BackBtn4).click();

	}
	
	public void ExpenseBtn()
	{
		driver.findElement(ExpenseBtn).click();

	}
	
	public void SubmitexpenseBtn()
	{
		driver.findElement(SubmitexpenseBtn).click();

	}
	
	public void SubmitexpensesBtn()
	{
		driver.findElement(SubmitexpensesBtn).click();

	}
	
	
	/*
	
	public void MissBtn() 
	{
		
		
		driver.findElement(MissBtn).click();

	}
	
	
	public void ExcepBtn()
	{
		driver.findElement(ExcepBtn).click();

	}
	
	*/
	
	public void BackBtn5() throws InterruptedException
	{
		
		
		 WebElement element = driver.findElement(BackBtn5);
  	     JavascriptExecutor executor = (JavascriptExecutor)driver;
  	     executor.executeScript("arguments[0].click();", element);
  	     Thread.sleep(1000);
		
		
		
		
		//driver.findElement(BackBtn5).click();
        
	}
	
	public void ApproveexpensesBtn()
	{
		driver.findElement(ApproveexpensesBtn).click();

	}
	
	public void ReviewBtn()
	{
		driver.findElement(ReviewBtn).click();

	}
	
	public void ApproveBtn()
	{
		driver.findElement(ApproveBtn).click();

	}
	
	public void CancelBtn()
	{
		driver.findElement(CancelBtn).click();

	}
	
	public void BackBtn6()
	{
		driver.findElement(BackBtn6).click();

	}
	
	public void BackBtn7()
	{
		driver.findElement(BackBtn7).click();

	}
	
	public void ExpenseapprovedbyadminBtn()
	{
		driver.findElement(ExpenseapprovedbyadminBtn).click();

	}
	
	public void ReporteeexpenseBtn()
	{
		driver.findElement(ReporteeexpenseBtn).click();

	}
	
	public void BackBtn8()
	{
		driver.findElement(BackBtn8).click();

	}
	
	public void BackBtn9()
	{
		driver.findElement(BackBtn9).click();

	}
	
	
	
	
}
