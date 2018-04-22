package com.basic.firstfeature;




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
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String uName){
		driver.findElement(By.name("firstname")).sendKeys(uName);
	}
	
	@Then("User checks user \"([^\"]*)\" first name present")
	public void User_checks_user_first_name_present(String s){
		String userNameActual = driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals(s,userNameActual );
	}

}
