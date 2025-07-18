package Supermanpages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class DBSetup {

	public void HoliayValidate() throws Exception {
		//try {
			//ConfigValues.TestCase = "Holiay Validate from DB";
			//ConfigValues.TestStartTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
 
			String url = "jdbc:mysql://superman-uat-db01.mysql.database.azure.com:3306/superman_05072025";
			String user = "mnkadmin";
			String password = "M@n!KAdm!n@#sm-uat-db01";
 
			//String staffPositionID = ConfigValues.staffpostionID;  
			String staffPositionID =  "4230";
			List<String> holidays = new ArrayList<>();
 
			String query = "SELECT h.Name " + "FROM userholidaymap uh "
					+ "JOIN holiday h ON h.id = uh.HolidayId AND YEAR(h.date) = 2025 AND h.IsActive "
					+ "WHERE uh.userid = (SELECT userid FROM staffpositionusermap WHERE StaffPositionId = "
					+ staffPositionID + " AND IsActive)";
 
			try (Connection conn = DriverManager.getConnection(url, user, password);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(query)) {
 
				while (rs.next()) {
					String holidayName = rs.getString("Name");
					holidays.add(holidayName);
				}
 
			} catch (SQLException e) {
				e.printStackTrace();
			}}}
 
			/*
			
			
			// Print the list of holidays
			if (holidays.isEmpty()) {
				System.out.println("No holidays found for StaffPositionID: " + staffPositionID);
			} else {
				List<String> holidaysFromUI = new ArrayList<>();
 
				// Loop through all holiday elements by resource-id
				for (int i = 0; i < 20; i++) { // increase max if more holidays
					try {
						String resourceId = "holiday-name-" + i;
						WebElement holidayElement = driver.findElement(
								AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"" + resourceId + "\")"));
						holidaysFromUI.add(holidayElement.getText().trim());
					} catch (Exception e) {
						// Break when no more matching elements
						break;
					}
				}
 
				// Compare lists (sorted for non-strict ordering)
				Collections.sort(holidays);
				Collections.sort(holidaysFromUI);
 
				if (holidays.equals(holidaysFromUI)) {
					System.out.println("✅ UI holiday list matches with DB holiday list.");
				} else {
					System.out.println("❌ Mismatch found!");
 
					List<String> missingInUI = new ArrayList<>(holidays);
					missingInUI.removeAll(holidaysFromUI);
 
					List<String> extraInUI = new ArrayList<>(holidaysFromUI);
					extraInUI.removeAll(holidays);
 
					if (!missingInUI.isEmpty()) {
						System.out.println("⚠️ Holidays missing on UI: " + missingInUI);
					}
 
					if (!extraInUI.isEmpty()) {
						System.out.println("⚠️ Extra holidays on UI: " + extraInUI);
					}
				}
			}
		} catch (Exception e) {
			ConfigValues.takeScreenshot(driver, ModuleName);
			JiraClient _jiraClient = new JiraClient();
 
			_jiraClient.JiraClientfun("SA", ConfigValues.TestCase, "UI holiday list not matches with DB holiday list.");
		} finally {
 
			ConfigValues.generator.addTestCaseRow("Admin Module", ConfigValues.TestCase, ConfigValues.TestStartTime,
					ConfigValues.TestEndTime);
			ConfigValues.TestCase = "";
			ConfigValues.TestStartTime = "";
			ConfigValues.TestEndTime = "";
		}
 
	}
 
	
	
	
	
	*/
	

