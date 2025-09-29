package SupermanQA;

import java.util.concurrent.TimeUnit;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.sikuli.script.*;
import org.testng.Assert;
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
	PlanNmeet objLoginPage2;
	private Supermanpages.Admin objLoginPage3;

	// This is for chromedriver setup and url invoke method before actual test cases
	@BeforeTest
	public void setup() throws InterruptedException {
		{
			

			WebDriverManager.chromedriver().setup(); // Automatically manage ChromeDriver
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://services-qa.0a6418a61f9c4aeb86ee.centralindia.aksapp.io/login");
			driver.manage().window().maximize();
			objLoginPage = new SupermanLoginpage(driver);
			objLoginPage.oneloginBtn(null); // Login_02
			Thread.sleep(1000);
			// objLoginPage.username("demouser$$@mankind.com");
			// Thread.sleep(1000);
			// objLoginPage.ContBtn();
			// objLoginPage.password("Test@12345");
			// Thread.sleep(2000);
			// objLoginPage.ContBtn2(); //Login_03
			// Thread.sleep(5000);
			// objLoginPage.NotnowBtn(); //Login_05
			// Thread.sleep(5000);
			objLoginPage.username1("demouser72@mankind.com"); // Login_06
			Thread.sleep(1000);
			objLoginPage.ContBtn3();
			objLoginPage.password1("Test@1234");
			Thread.sleep(2000);
			objLoginPage.ContBtn4();

		}
	}

	/*
	 * @Test(priority = 1) public void SupermanLogin() throws InterruptedException {
	 * 
	 * 
	 * objLoginPage = new SupermanLoginpage(driver); objLoginPage.oneloginBtn(null);
	 * //Login_02 Thread.sleep(1000);
	 * //objLoginPage.username("demouser$$@mankind.com"); //Thread.sleep(1000);
	 * //objLoginPage.ContBtn(); //objLoginPage.password("Test@12345");
	 * //Thread.sleep(2000); //objLoginPage.ContBtn2(); //Login_03
	 * //Thread.sleep(5000); //objLoginPage.NotnowBtn(); //Login_05
	 * //Thread.sleep(5000); objLoginPage.username1("demouser72@mankind.com");
	 * //Login_06 Thread.sleep(1000); objLoginPage.ContBtn3();
	 * objLoginPage.password1("Test@1234"); Thread.sleep(2000);
	 * objLoginPage.ContBtn4();
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void SupermanHome() throws InterruptedException {

		// SupermanHome();
		objLoginPage1 = new SupermanHome(driver);

		objLoginPage1.SearchBtn(); 
		Thread.sleep(3000);
		objLoginPage1.NotificationBtn();
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void Verify_Plan_meet() throws InterruptedException {

		// SupermanLogin();
		objLoginPage2 = new PlanNmeet(driver);
		clickPlanAndMeetUsingSikuli();
		
		String actual = driver.findElement(By.xpath("//*[text()=\"Review DCR\"]")).getText();
		System.out.println(actual);
		String expected = "Review DCR";
		Assert.assertEquals(actual, expected, "Review DCR button is visible");
	}
		
		@Test(priority = 3)
		public void Verify_Review_DCR_Button() throws InterruptedException {

			// SupermanLogin();
			objLoginPage2 = new PlanNmeet(driver);
			clickPlanAndMeetUsingSikuli();
			Thread.sleep(3000);
			objLoginPage2.dcrBtn(); 
			Thread.sleep(3000);
			
			
			String actual = driver.findElement(By.xpath("//*[text()=\"Daily Call Reporting\"]")).getText();
			System.out.println(actual);
			String expected = "Daily Call Reporting";
			Assert.assertEquals(actual, expected, "Daily Call Reporting Text is visible");
		}
			
			@Test(priority = 4)
			public void Verify_Add_Adhocparty() throws InterruptedException {

				// SupermanLogin();
				objLoginPage2.calBtn();
				Thread.sleep(3000); 
				objLoginPage2.date();
				Thread.sleep(3000);
				objLoginPage2.adhoccall(); Thread.sleep(3000); clickAdhoccallUsingSikuli();
				 objLoginPage2.Searchypartydoctor(); Thread.sleep(3000);
				 objLoginPage2.Searchparty("Kumar"); Thread.sleep(3000);
				 objLoginPage2.Selectsearchparty(); Thread.sleep(3000); objLoginPage2.Go();
				 Thread.sleep(3000);
				
				
			}
			
			@Test(priority = 5)
			public void Verify_AdhocParty_DCR() throws InterruptedException {

				objLoginPage2.Doctorcard(); Thread.sleep(3000);
				 objLoginPage2.Rightarrow(); Thread.sleep(3000); clickRarrowUsingSikuli();
				 Thread.sleep(3000); objLoginPage2.Disscussedproduct(); Thread.sleep(3000);
				 objLoginPage2.Subbrand(); Thread.sleep(3000); objLoginPage2.Donebtn();
				 Thread.sleep(3000); clickRarrowUsingSikuli(); Thread.sleep(3000);
				 clickRarrowUsingSikuli(); Thread.sleep(3000); objLoginPage2.Noitemgiven();
				 Thread.sleep(3000); clickRarrowUsingSikuli(); Thread.sleep(3000);
				 objLoginPage2.Dmsbtn(); Thread.sleep(3000); objLoginPage2.Done();
				
					
			}
			
			@Test(priority = 6)
			public void Verify_Add_NFA() throws InterruptedException {

				Thread.sleep(2000); objLoginPage2.Nfa(); Thread.sleep(2000);
				 objLoginPage2.Transit(); Thread.sleep(2000); objLoginPage2.Gobtn();
				 Thread.sleep(2000); clickLocationUsingSikuli(); Thread.sleep(2000);
				 clickLocationsearchUsingSikuli(); Thread.sleep(2000);
				 clickSelectactivitytypeUsingSikuli(); Thread.sleep(2000);
				 clickTransitoptionUsingSikuli(); Thread.sleep(2000);
				 objLoginPage2.Remarks("Testing"); Thread.sleep(2000);
				 objLoginPage2.Confirmbtn(); Thread.sleep(2000);
				
					
			}
			
			@Test(priority = 7)
			public void Verify_Submit_DCR() throws InterruptedException {
				objLoginPage2.SubmitBtn();
				 //Thread.sleep(2000); objLoginPage2.SubmitBt(); Thread.sleep(2000);
				 //clickCalculateUsingSikuli(); Thread.sleep(2000); //
				 //objLoginPage2.CalculateBtn(); // Thread.sleep(4000); //
				 //objLoginPage2.SaveBtn(); 
				
				
					
			}
			
			@Test(priority = 8)
			public void Verify_Performance_Tab() throws InterruptedException {
				Thread.sleep(2000);
				clickPerformanceUsingSikuli(); Thread.sleep(2000);
				 objLoginPage2.Dashboard(); Thread.sleep(2000); objLoginPage2.CrossBtn();
				 Thread.sleep(2000);
				
					
			}
			
			@Test(priority = 9)
			public void Verify_Directory_Tab() throws InterruptedException {
				 Thread.sleep(2000); clickDirectoryUsingSikuli(); Thread.sleep(2000);
				 objLoginPage2.Chemist(); Thread.sleep(8000); objLoginPage2.Stockist();
				 Thread.sleep(2000); objLoginPage2.Ho(); Thread.sleep(2000);
				
					
			}
			
			@Test(priority = 10)
			public void Verify_GSP_Tab() throws InterruptedException {
			Thread.sleep(2000);clickGspUsingSikuli(); Thread.sleep(4000); objLoginPage2.Brandview();
			Thread.sleep(2000); objLoginPage2.Monthlyview(); Thread.sleep(2000);
			objLoginPage2.Dashboardgsp(); Thread.sleep(5000);
				
					
			}
			
			@Test(priority = 11)
			public void Verify_Import_Dcr() throws InterruptedException {
			Thread.sleep(2000);
			clickPlanAndMeetUsingSikuli();
			Thread.sleep(3000);
			objLoginPage2.dcrBtn(); 
			Thread.sleep(3000);
			objLoginPage2.Selectall();
			objLoginPage2.ImportDcr();
					
			}
			
			
			@Test(priority = 12)
			public void Verify_Logout() throws InterruptedException {
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,70);");
				Thread.sleep(2000);clickLogoutUsingSikuli();
				Thread.sleep(4000);
				clickLokUsingSikuli();
				//objLoginPage2.logouOKBtnn();
				Thread.sleep(2000);
				
					
			}
				
				
		
		
		/*
		 *  objLoginPage2.calBtn();
		 * Thread.sleep(3000); objLoginPage2.date(); Thread.sleep(3000);
		 * objLoginPage2.adhoccall(); Thread.sleep(3000); clickAdhoccallUsingSikuli();
		 * objLoginPage2.Searchypartydoctor(); Thread.sleep(3000);
		 * objLoginPage2.Searchparty("Kumar"); Thread.sleep(3000);
		 * objLoginPage2.Selectsearchparty(); Thread.sleep(3000); objLoginPage2.Go();
		 * Thread.sleep(3000); objLoginPage2.Doctorcard(); Thread.sleep(3000);
		 * objLoginPage2.Rightarrow(); Thread.sleep(3000); clickRarrowUsingSikuli();
		 * Thread.sleep(3000); objLoginPage2.Disscussedproduct(); Thread.sleep(3000);
		 * objLoginPage2.Subbrand(); Thread.sleep(3000); objLoginPage2.Donebtn();
		 * Thread.sleep(3000); clickRarrowUsingSikuli(); Thread.sleep(3000);
		 * clickRarrowUsingSikuli(); Thread.sleep(3000); objLoginPage2.Noitemgiven();
		 * Thread.sleep(3000); clickRarrowUsingSikuli(); Thread.sleep(3000);
		 * objLoginPage2.Dmsbtn(); Thread.sleep(3000); objLoginPage2.Done();
		 * Thread.sleep(2000); objLoginPage2.Nfa(); Thread.sleep(2000);
		 * objLoginPage2.Transit(); Thread.sleep(2000); objLoginPage2.Gobtn();
		 * Thread.sleep(2000); clickLocationUsingSikuli(); Thread.sleep(2000);
		 * clickLocationsearchUsingSikuli(); Thread.sleep(2000);
		 * clickSelectactivitytypeUsingSikuli(); Thread.sleep(2000);
		 * clickTransitoptionUsingSikuli(); Thread.sleep(2000);
		 * objLoginPage2.Remarks("Testing"); Thread.sleep(2000);
		 * objLoginPage2.Confirmbtn(); Thread.sleep(2000); objLoginPage2.SubmitBtn();
		 * Thread.sleep(2000); objLoginPage2.SubmitBt(); Thread.sleep(2000);
		 * clickCalculateUsingSikuli(); Thread.sleep(2000); //
		 * objLoginPage2.CalculateBtn(); // Thread.sleep(4000); //
		 * objLoginPage2.SaveBtn(); // Thread.sleep(2000); objLoginPage2.Closeicon();
		 * Thread.sleep(2000); clickPerformanceUsingSikuli(); Thread.sleep(2000);
		 * objLoginPage2.Dashboard(); Thread.sleep(2000); objLoginPage2.CrossBtn();
		 * Thread.sleep(2000); clickDirectoryUsingSikuli(); Thread.sleep(2000);
		 * objLoginPage2.Chemist(); Thread.sleep(8000); objLoginPage2.Stockist();
		 * Thread.sleep(2000); objLoginPage2.Ho(); Thread.sleep(2000);
		 * clickGspUsingSikuli(); Thread.sleep(8000); objLoginPage2.Brandview();
		 * Thread.sleep(2000); objLoginPage2.Monthlyview(); Thread.sleep(2000);
		 * objLoginPage2.Dashboardgsp(); Thread.sleep(2000);
		 */

	
	
	

	/*
	 * @Test(priority = 3) public static void clickAdminUsingSikuli() throws
	 * InterruptedException {
	 * 
	 * // AD_01 Screen screen = new Screen(); Thread.sleep(4000); Pattern
	 * buttonImage2 = new Pattern(
	 * "C:\\Users\\akash.shrivastava\\eclipse-workspace2\\SupermanQA\\src\\test\\java\\image\\admin.png"
	 * );
	 * 
	 * 
	 * try { screen.wait(buttonImage2, 10); screen.click(buttonImage2); } catch
	 * (FindFailed e) { System.out.println("Could not find the image."); }
	 * 
	 * Thread.sleep(6000);
	 * 
	 * }
	 * 
	 * @Test(priority = 4) public void Admin() throws InterruptedException {
	 * 
	 * objLoginPage3 = new Admin(driver);
	 * 
	 * 
	 * objLoginPage3.InventoryBtn(); Thread.sleep(3000);
	 * objLoginPage3.PendingSample(); Thread.sleep(3000);
	 * objLoginPage3.PendingItem(); Thread.sleep(8000); objLoginPage3.ReturnItem();
	 * Thread.sleep(8000); objLoginPage3.ReturnHistory(); Thread.sleep(8000);
	 * objLoginPage3.CreateReturn(); Thread.sleep(8000);
	 * objLoginPage3.ApproveReturn(); Thread.sleep(10000);
	 * objLoginPage3.ApproveOther(); Thread.sleep(8000);
	 * objLoginPage3.ChallanShort(); Thread.sleep(6000); objLoginPage3.BackBtn();
	 * Thread.sleep(3000); objLoginPage3.LeaveBtn(); Thread.sleep(3000);
	 * objLoginPage3.HolidayBtn(); Thread.sleep(3000); objLoginPage3.BackBtn1();
	 * Thread.sleep(10000); objLoginPage3.MyemployeeBtn(); Thread.sleep(3000);
	 * objLoginPage3.EmployeesleavesBtn(); Thread.sleep(3000);
	 * objLoginPage3.SelectuserBtn(); Thread.sleep(3000);
	 * objLoginPage3.Selectbox("10024783"); Thread.sleep(3000);
	 * objLoginPage3.Selectbox1(); Thread.sleep(6000); objLoginPage3.BackBtn3();
	 * Thread.sleep(5000); objLoginPage3.ZhoBtn(); Thread.sleep(3000);
	 * objLoginPage3.OrderBtn(); Thread.sleep(3000); objLoginPage3.SummaryBtn();
	 * Thread.sleep(3000); objLoginPage3.PendingpodBtn(); Thread.sleep(3000);
	 * objLoginPage3.BackBtn4(); Thread.sleep(8000);
	 * 
	 * 
	 * 
	 * 
	 * objLoginPage3.ExpenseBtn(); Thread.sleep(3000);
	 * objLoginPage3.SubmitexpenseBtn(); Thread.sleep(3000);
	 * objLoginPage3.SubmitexpensesBtn(); Thread.sleep(5000);
	 * //objLoginPage3.MissBtn(); Thread.sleep(3000); //objLoginPage3.ExcepBtn();
	 * Thread.sleep(3000);
	 * 
	 * objLoginPage3.BackBtn5(); Thread.sleep(5000);
	 * objLoginPage3.ApproveexpensesBtn(); Thread.sleep(3000);
	 * objLoginPage3.ReviewBtn(); Thread.sleep(3000); objLoginPage3.ApproveBtn();
	 * Thread.sleep(3000); objLoginPage3.CancelBtn(); Thread.sleep(8000);
	 * objLoginPage3.BackBtn6(); Thread.sleep(8000); objLoginPage3.BackBtn7();
	 * Thread.sleep(8000); objLoginPage3.ExpenseapprovedbyadminBtn();
	 * Thread.sleep(3000); objLoginPage3.ReporteeexpenseBtn(); Thread.sleep(10000);
	 * objLoginPage3.BackBtn8(); Thread.sleep(8000); objLoginPage3.BackBtn9();
	 * Thread.sleep(5000);
	 * 
	 * 
	 * }
	 * 
	 */

	public static void clickPlanAndMeetUsingSikuli() throws InterruptedException {

		// Sikuli screen object
		Screen screen = new Screen();
		Thread.sleep(4000);
		Pattern buttonImage1 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Plan&Meet.png");

		try {
			screen.wait(buttonImage1, 10);
			screen.click(buttonImage1);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}

	public static void clickAdhoccallUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage2 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\adhoccall.png");

		try {
			if (screen.exists(buttonImage2, 10) != null) {

				screen.click(buttonImage2);
				Thread.sleep(2000); // Give UI time to respond
			} else {
				System.out.println("Adhoccall image not found.");
			}
		} catch (FindFailed e) {
			System.out.println("Sikuli FindFailed: " + e.getMessage());
		}

		Thread.sleep(3000);

	}

	public static void clickRarrowUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage3 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Rarrow.png");

		try {

			screen.click(buttonImage3);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}

	public static void clickSelectactivitytypeUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage4 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Selectactivitytype.png");

		try {

			screen.click(buttonImage4);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}

	public static void clickTransitoptionUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage5 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Transitoption.png");

		try {

			screen.click(buttonImage5);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}

	public static void clickLocationUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage6 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Location.png");

		try {

			screen.click(buttonImage6);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}

	public static void clickLocationsearchUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage7 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Locationsearch.png");

		try {

			screen.click(buttonImage7);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}

	public static void clickCalculateUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage8 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Calculate.png");

		try {

			screen.click(buttonImage8);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}

	public static void clickPerformanceUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage9 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Performance.png");

		try {

			screen.click(buttonImage9);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}

	public static void clickDirectoryUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage10 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Directory.png");

		try {

			screen.click(buttonImage10);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}

	public static void clickGspUsingSikuli() throws InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern buttonImage11 = new Pattern(
				"C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\GSP.png");

		try {

			screen.click(buttonImage11);
		} catch (FindFailed e) {
			System.out.println("Could not find the image.");
		}

		Thread.sleep(6000);

	}
	
	
	 public static void clickLogoutUsingSikuli() throws InterruptedException { 
	 Screen screen = new Screen(); Pattern buttonImage12 = new Pattern("C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Logout.png"
	  );
	 
	 try {
	 
	  screen.click(buttonImage12); } catch (FindFailed e) {
	  System.out.println("Could not find the image."); }
	 
	 
	 Thread.sleep(6000);
	 
	 }
	 
	 
	 
	 public static void clickLokUsingSikuli() throws InterruptedException { 
		 Screen screen = new Screen(); Pattern buttonImage13 = new Pattern("C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\src\\test\\java\\image\\Ok.png"
		  );
		 
		 try {
		 
		  screen.click(buttonImage13); } catch (FindFailed e) {
		  System.out.println("Could not find the image."); }
		 
		 
		 Thread.sleep(6000);
		 
		 }
	 
	
	@AfterTest
	public void closebrowser() {
		driver.close();
	}

}
