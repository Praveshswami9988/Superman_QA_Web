package SupermanQA;

import java.util.concurrent.TimeUnit;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.sikuli.script.*;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Supermanpages.SupermanLoginpage;
import Supermanpages.SupermanHome;
import Supermanpages.PlanNmeet;
import Supermanpages.Admin;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTest {


		WebDriver driver;
		SupermanHome objLoginPage1;
		SupermanLoginpage objLoginPage;
		Supermanpages.PlanNmeet objLoginPage2;
		private Supermanpages.Admin objLoginPage3;
		
		
		
		
		@BeforeTest
		public void setup() {
			{
				//Login_01 to Login_06
				
				WebDriverManager.chromedriver().setup(); // Automatically manage ChromeDriver
		        driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://services-qa.0a6418a61f9c4aeb86ee.centralindia.aksapp.io/login");
				driver.manage().window().maximize();
				
					

			}
		}
			
		 
		  @Test(priority = 1) public void SupermanLogin() throws InterruptedException {
		  
		  
			 objLoginPage = new SupermanLoginpage(driver);
			 objLoginPage.oneloginBtn(null);
			 Thread.sleep(1000);
			 //objLoginPage.username("demouser$$@mankind.com");
			 //Thread.sleep(1000);
			 //objLoginPage.ContBtn();
			 //objLoginPage.password("Test@12345");
			 //Thread.sleep(2000);
			 //objLoginPage.ContBtn2();
			 //Thread.sleep(5000);
			 //objLoginPage.NotnowBtn();
			 //Thread.sleep(5000);
			 objLoginPage.username1("demouser72@mankind.com");
			 Thread.sleep(1000);
			 objLoginPage.ContBtn3();
			 objLoginPage.password1("Test@1234");
			 Thread.sleep(2000);
			 objLoginPage.ContBtn4();
			  
		  }
	

			@Test(priority = 2) public void SupermanHome() throws InterruptedException {
				
				//SupermanHome();
				objLoginPage1 = new SupermanHome(driver);
				
				objLoginPage1.SearchBtn();
				Thread.sleep(3000);
				objLoginPage1.NotificationBtn();
				Thread.sleep(3000);
				
			}
			
			/*
	
	
	@Test(priority = 3) public void PlanNmeet() throws InterruptedException {
		
		//SupermanLogin();
		
		//clickPlanAndMeetUsingSikuli();
		
		
		objLoginPage2.dcrBtn();
		Thread.sleep(3000);
		objLoginPage2.calBtn();
		Thread.sleep(3000);
		objLoginPage2.date();
		Thread.sleep(3000);
		objLoginPage2.doctor();
		Thread.sleep(3000);
		clickRightarrowUsingSikuli();
		Thread.sleep(3000);
		objLoginPage2.slide2();
		Thread.sleep(3000);
		objLoginPage2.slide3();
		Thread.sleep(3000);
		objLoginPage2.slide4();
		Thread.sleep(3000);
		objLoginPage2.slide5();
		Thread.sleep(3000);
		clickRarrowUsingSikuli();
		Thread.sleep(3000);
		objLoginPage2.dropdownBtn();
		Thread.sleep(3000);
		objLoginPage2.slide6();
		Thread.sleep(3000);
		clickRightarrowUsingSikuli();
		Thread.sleep(3000);
		objLoginPage2.slide8();
		Thread.sleep(3000);
		objLoginPage2.slide9();
		Thread.sleep(3000);
		clickSubmitUsingSikuli();
		Thread.sleep(3000);
		objLoginPage2.slide10();
		Thread.sleep(3000);
		objLoginPage2.slide11();
		Thread.sleep(3000);
		objLoginPage2.slide12();
		Thread.sleep(3000);
		
		
	}
	
	*/
		@Test(priority = 3) public static void clickAdminUsingSikuli() throws InterruptedException {
		
	     // AD_01
       Screen screen = new Screen();
       Thread.sleep(4000);
       Pattern buttonImage2 = new Pattern("C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\admin.png");
       
       
       try {
           screen.wait(buttonImage2, 10);
           screen.click(buttonImage2);     
       } catch (FindFailed e) {
           System.out.println("Could not find the image.");
       }
    
        Thread.sleep(6000);
    
	   }
	
		@Test(priority = 4) public void Admin() throws InterruptedException {
			
			objLoginPage3 = new Admin(driver);
			
			
			objLoginPage3.InventoryBtn();
			Thread.sleep(3000);
			objLoginPage3.PendingSample();
			Thread.sleep(3000);
			objLoginPage3.PendingItem();
			Thread.sleep(3000);
			objLoginPage3.ReturnItem();
			Thread.sleep(3000);
			objLoginPage3.ReturnHistory();
			Thread.sleep(3000);
			objLoginPage3.CreateReturn();
			Thread.sleep(3000);
			objLoginPage3.ApproveReturn();
			Thread.sleep(3000);
			objLoginPage3.ApproveOther();
			Thread.sleep(3000);
			objLoginPage3.ChallanShort();
			Thread.sleep(10000);
			objLoginPage3.BackBtn();
			Thread.sleep(3000);
			objLoginPage3.LeaveBtn();
			Thread.sleep(3000);
			objLoginPage3.HolidayBtn();
			Thread.sleep(3000);
			objLoginPage3.BackBtn1();
			Thread.sleep(10000);
			objLoginPage3.MyemployeeBtn();
			Thread.sleep(3000);
			objLoginPage3.EmployeesleavesBtn();
			Thread.sleep(3000);
			objLoginPage3.SelectuserBtn();
			Thread.sleep(3000);
			objLoginPage3.Selectbox("10050366");
			Thread.sleep(3000);
			objLoginPage3.Selectbox1();
			Thread.sleep(6000);
			objLoginPage3.BackBtn3();
			Thread.sleep(5000);
			objLoginPage3.ZhoBtn();
			Thread.sleep(3000);
			objLoginPage3.OrderBtn();
			Thread.sleep(3000);
			objLoginPage3.SummaryBtn();
			Thread.sleep(3000);
			objLoginPage3.PendingpodBtn();
			Thread.sleep(3000);
			objLoginPage3.BackBtn4();
			Thread.sleep(8000);
			objLoginPage3.ExpenseBtn();
			Thread.sleep(3000);
			objLoginPage3.SubmitexpenseBtn();
			Thread.sleep(3000);
			objLoginPage3.SubmitexpensesBtn();
			Thread.sleep(5000);
			objLoginPage3.BackBtn5();
			Thread.sleep(5000);
			objLoginPage3.ApproveexpensesBtn();
			Thread.sleep(3000);
			objLoginPage3.ReviewBtn();
			Thread.sleep(3000);
			objLoginPage3.ApproveBtn();
			Thread.sleep(3000);
			objLoginPage3.CancelBtn();
			Thread.sleep(8000);
			objLoginPage3.BackBtn6();
			Thread.sleep(8000);
			objLoginPage3.BackBtn7();
			Thread.sleep(8000);
			objLoginPage3.ExpenseapprovedbyadminBtn();
			Thread.sleep(3000);
			objLoginPage3.ReporteeexpenseBtn();
			Thread.sleep(10000);
			objLoginPage3.BackBtn8();
			Thread.sleep(8000);
			objLoginPage3.BackBtn9();
			Thread.sleep(5000);
			
			
		}
		
		
		
		
	/*
	public static void clickPlanAndMeetUsingSikuli() throws InterruptedException {
		
		
	     // Sikuli screen object
        Screen screen = new Screen();
        Thread.sleep(4000);
        Pattern buttonImage1 = new Pattern("C:\\SupeMan_wokrsapceNew\\SupermanWeb\\src\\test\\java\\image\\Plan&Meet.png");
        
        
        try {
            screen.wait(buttonImage1, 10);
            screen.click(buttonImage1);     
        } catch (FindFailed e) {
            System.out.println("Could not find the image.");
        }
     
        
     Thread.sleep(6000);
		
	}
	
	*/
	public static void clickRightarrowUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Screen screen = new Screen();
        Pattern buttonImage2 = new Pattern("C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Rightarrow.png");
        
        
        
        try {
            if (screen.exists(buttonImage2, 10) != null) {
                
                
            	screen.highlight(2);
                screen.click(buttonImage2);  
                Thread.sleep(2000);  // Give UI time to respond
            } else {
                System.out.println("Rightarrow image not found.");
            }
        } catch (FindFailed e) {
            System.out.println("Sikuli FindFailed: " + e.getMessage());
        }
        
        Thread.sleep(3000);
		
	}
	
	
	public static void clickRightarrowUsingSikuli1() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Screen screen = new Screen();
        Pattern buttonImage2 = new Pattern("C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Rightarrow.png");
        
        
        
        try {
            if (screen.exists(buttonImage2, 10) != null) {
                
                
            	screen.highlight(2);
                screen.click(buttonImage2);  
                Thread.sleep(2000);  // Give UI time to respond
            } else {
                System.out.println("Rightarrow image not found.");
            }
        } catch (FindFailed e) {
            System.out.println("Sikuli FindFailed: " + e.getMessage());
        }
        
        Thread.sleep(3000);
		
	}
	
	
	
	public static void clickRarrowUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Screen screen = new Screen();
        Pattern buttonImage2 = new Pattern("C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Rarrow.png");
        
        
        
        try {
            if (screen.exists(buttonImage2, 10) != null) {
                
                
            	screen.highlight(2);
                screen.click(buttonImage2);  
                Thread.sleep(2000);  // Give UI time to respond
            } else {
                System.out.println("Rightarrow image not found.");
            }
        } catch (FindFailed e) {
            System.out.println("Sikuli FindFailed: " + e.getMessage());
        }
        
        Thread.sleep(3000);
		
	}
	
	
	

	public static void clickSubmitUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Screen screen = new Screen();
        Pattern buttonImage2 = new Pattern("C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Submit.png");
        
        
        
        try {
            if (screen.exists(buttonImage2, 10) != null) {
                
                
            	screen.highlight(2);
                screen.click(buttonImage2);  
                Thread.sleep(2000);  // Give UI time to respond
            } else {
                System.out.println("Submit image not found.");
            }
        } catch (FindFailed e) {
            System.out.println("Sikuli FindFailed: " + e.getMessage());
        }
        
        Thread.sleep(3000);
		
	}
	
	
	
	
	}
	
	

