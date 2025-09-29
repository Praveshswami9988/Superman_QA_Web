package Supermanpages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;




public class DBSetup {
@Test
	public void HoliayValidate() throws Exception {
		//try {
			//ConfigValues.TestCase = "Holiay Validate from DB";
			//ConfigValues.TestStartTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
 
			String url = "jdbc:mysql://superman-uat-db01.mysql.database.azure.com:3306/superman_01082025";
			String user = "mnkadmin";
			String password = "M@n!KAdm!n@#sm-uat-db01";
 
			//String staffPositionID = ConfigValues.staffpostionID;  
			String staffPositionID =  "4230";
			List<String> holidays = new ArrayList<>();
			List<String> list = new ArrayList<>(Arrays.asList(
		            "Labour Day", 
		            "Independence Day", 
		            "Holi", 
		            "Bahag Bihu", 
		            "Mahatma Gandhi's Birthday / Dussehra", 
		            "Dussehra (Maha Ashtami)", 
		            "Dussehra (Maha Navmi)", 
		            "Diwali"
		        ));
 
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
					System.out.println(holidayName);
					Assert.assertTrue(list.contains(holidayName), "The list does not contain the holiday: " + holidayName);
					
				}
				System.out.println("Test passed! The list contains the holiday.");
				
 
			} catch (SQLException e) {
				e.printStackTrace();
				
				
				
			}}}
 
		
	

