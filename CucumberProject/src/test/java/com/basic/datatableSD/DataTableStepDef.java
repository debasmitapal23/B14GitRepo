package com.basic.datatableSD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataTableStepDef {
	
	
	WebDriver driver =null;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){
		System.setProperty("webdriver.chrome.driver", "E:\\Radical_software\\64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	
	@When("Enter followind data")
	public void enter_followind_data(DataTable table) throws InterruptedException{
		
		List<List<String>> data = table.raw();
		
		String values1 = data.get(0).get(0);
		String values2 = data.get(0).get(1);
		String values3 = data.get(0).get(2);
		driver.findElement(By.name("firstname")).sendKeys(values1);
		driver.findElement(By.name("lastname")).sendKeys(values2);
		driver.findElement(By.name("reg_email__")).sendKeys(values3);
		
		
		
		
		String values4 = data.get(1).get(0);
		String values5 = data.get(1).get(1);
		String values6 = data.get(1).get(2);
		
//		driver.findElement(By.name("firstname")).sendKeys(values4);
//		driver.findElement(By.name("lastname")).sendKeys(values5);
		Thread.sleep(2000);
		
		
		
	}
	
	
}
