package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FindContact {

	public static void main(String[] args) {
		//Find Contact in leaftaps website -- Assignment 1
//Step 1: Open the browser
//Step 2: Load the URL
//Step 3: Maximize the browser
//Step 4: Enter UserName
//Step 5: Enter Password
//Step 6: Click Login
//Step 7: Click CRM/SFA
//Step 8: Click Contacts Tab
//Step 9: Click Find Contacts
//Step 10: Add email id to the account and verify the email id 
//Step 11: Click Find Contacts button
//Step 12: Click Email Tab
//Step 13: Type email as babu@testleaf.com
//Step 14: Click Find Contacts
//Step 15: Close the browser

		WebDriverManager.chromedriver().setup(); 
		//Step 1: Open the browser
		 ChromeDriver driver=new ChromeDriver();	
		//Step 2: Load the URL
		 driver.get("http://leaftaps.com/opentaps/control/main");	
		//Step 3: Maximize the browser
		 driver.manage().window().maximize();	
		 
		 
		//Step 4: Enter UserName
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Step 5: Enter Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");	
		//Step 6: Click Login
		 driver.findElement(By.className("decorativeSubmit")).click();	
		//Step 7: Click CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click(); //Click CRM/SFA

		//Step 8: Click Contacts Tab
		 driver.findElement(By.linkText("Contacts")).click();	
		//Step 9: Click Find Contacts
		 driver.findElement(By.linkText("Create Contact")).click();	
		 
		 //To add email id to the account and verify the email id 
		 driver.findElement(By.id("firstNameField")).sendKeys("Gomathi");
		 driver.findElement(By.id("lastNameField")).sendKeys("Siddaiyan");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("gomusidyan@gmail.com");
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 String email=driver.findElement(By.linkText("gomusidyan@gmail.com")).getText();
		 
		//Step 10: Click Find Contacts button
		 driver.findElement(By.linkText("Find Contacts")).click();
		//Step 11: Click Email Tab
		 driver.findElement(By.linkText("Email")).click();	
		//Step 12: Type email as babu@testleaf.com
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gomusidyan@gmail.com"); 
		//Step 13: Click Find Contacts
		 driver.findElement(By.linkText("Find Contacts")).click();
		 
		 
		 String title=driver.getTitle();
		 System.out.println("The Title of the page :"+title);
		 System.out.println("The Given Email address: "+email);
		//Step 14: Close the browser
		 //driver.close();	
		
	}

}
