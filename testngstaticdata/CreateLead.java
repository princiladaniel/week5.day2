package testngstaticdata;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{
@Test(dataProvider = "getData")
	public void createLead(String companyname,String firstname,String lastName,String phonenum) {
	
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phonenum);
		driver.findElement(By.name("submitButton")).click();
	}
@DataProvider(name="getData")
public String[][] fetchData() {
	String[][] data=new String[2][4];
	data[0][0]="TestLeaf";
	data[0][1]="Princila";
	data[0][2]="Edward";
	data[0][3]="80563";
	
	data[1][0]="Qeagle";
	data[1][1]="Roseline";
	data[1][2]="Daniel";
	data[1][3]="9381";
	
	return data;
	
}
}
