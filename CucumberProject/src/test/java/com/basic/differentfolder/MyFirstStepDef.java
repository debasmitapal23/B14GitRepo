package com.basic.differentfolder;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyFirstStepDef {
	
	WebDriver driver;
	@Given("^User need to be on facebook login page$")
	public void User_need_to_be_on_facebook_login_page(){
		System.setProperty("webdriver.chrome.driver","E:\\Radical_software\\64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	
	@When("^User enters user \"([^\"]*)\" first name and \"([^\"]*)\" user lastname$")
	public void User_enters_user_first_name_and_user_lastname(String uName,String ulName){
		driver.findElement(By.name("firstname")).sendKeys(uName);
		driver.findElement(By.name("lastname")).sendKeys(ulName);
		
	}
	
	@Then("User checks user \"([^\"]*)\" first name present and \"([^\"]*)\" user lastname present")
	public void User_checks_user_first_name_present_and_user_lastname_present(String s, String l) throws Throwable{
		String userNameActual = driver.findElement(By.name("firstname")).getAttribute("value");
		String userlastnameActual = driver.findElement(By.name("lastname")).getAttribute("value");
		
		Assert.assertEquals(s,userNameActual);
		Assert.assertEquals(l,userlastnameActual);
	}

}
