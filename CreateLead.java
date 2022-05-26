package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@Test

	public void runCreateLead(){
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HVL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishnavi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		driver.findElement(By.name("submitButton")).click();
}
	/*@DataProvider
	public String [][] testData(){
		String[][] array = new String [2][5];
		
		array [0][0] = "Demosalesmanager";
		array [0][1] = "crmsfa";
		array [0][2] = "TL";
		array [0][3] = "Vaishnavi";
		array [0][4] = "J";
		
		array [1][0] = "Demosalesmanager";
		array [1][1] = "crmsfa";
		array [1][2] = "TL";
		array [1][3] = "Hari";
		array [1][4] = "N";
		
		return array;*/
	}






