package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	 public static void main(String[] args) {
		
//		 //Class Room::Open Login Page, Give Username, password, click Submit
//	Step 1:	 Open the browser
//	Step 2:	 Load the URL
//	Step 3:	 Maximize the browser
//	Step 4:	 Enter UserName
//	Step 5:	 Enter Password
//	Step 6:	 Click Login
//	Step 7:	 Click CRM/SFA
//	Step 8:	 Click Leads
//	Step 9:	 Click Create Lead
//	Step 10: Type Company Name
//	Step 11: Type First Name
//	Step 12: Type Last Name
//	Step 13: Click Create Lead Button
		 
		 WebDriverManager.chromedriver().setup(); 
		 // Open the browser
		 ChromeDriver driver=new ChromeDriver(); 
		 //Load the URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 // Maximize the browser
		 driver.manage().window().maximize();
		 
		 
		 // Enter UserName
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 //Enter Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 //Click Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //Click CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 //Click Leads
		 driver.findElement(By.linkText("Leads")).click();
		 //Click Create Lead
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 
		 // Type Company Name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		 //Type First Name
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gomathi");
		 //Type Last Name
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Siddaiyan");
		 // Click Create Lead Button
		 driver.findElement(By.name("submitButton")).click();
		 
		 
		 String title=driver.getTitle();
		 System.out.println(title);
		String compName= driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(compName);
		//driver.close();
		// Step 9: Click Leads 
		driver.findElement(By.linkText ("Leads")).click() ; 
		// Step 10: Find Leads 
		driver.findElement (By.linkText ("Find Leads")). click(); 
		// Step 11: Click on the phone tab 
		driver.findElement(By.xpath( "//span[text()='Phone']")).click();
		driver.findElement(By.name( "phoneNumber")).sendKeys("9500");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		 }
}
