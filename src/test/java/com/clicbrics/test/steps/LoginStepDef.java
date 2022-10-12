package com.clicbrics.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {

	WebDriver driver;

	@Given("User Launch Clicbrics Web Application")
	public void user_Launch_Clicbrics_Web_Application() {

		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();

		driver.get("https://qa.clicbrics.com/");

		driver.manage().window().maximize();

	}

	@When("User Clicks Sign In button")
	public void user_Clicks_Sign_In_button() {

		WebElement signbutton = driver.findElement(By.xpath("//button[@class='Navbar_topnav__actions__0FVWe undefined btn']"));

		signbutton.click();


	}

	@When("User Enters Valid Mobile Number")
	public void user_Enters_Valid_Mobile_Number() {

		WebElement mobileno = driver.findElement(By.xpath("//input[@id='login-email']"));

		mobileno.sendKeys("9940429754");

	}

	@When("User Clicks Privacy policy and Continue button")
	public void user_Clicks_Privacy_policy_and_Continue_button() {

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox_id']"));

		checkbox.click();

		WebElement continuee = driver.findElement(By.xpath("//button[text()='Continue']"));

		continuee.click();

	}

	@When("User Enters Valid Password")
	public void user_Enters_Valid_Password() {

		WebElement password = driver.findElement(By.xpath("//input[@id='signupPassword']"));

		password.sendKeys("May@25@92");

	}

	@When("User Clicks Continue button")
	public void user_Clicks_Continue_button() {

		WebElement continuee = driver.findElement(By.xpath("//button[text()='Continue']"));

		continuee.click();


	}

	@Then("User Verify Successfully Login Into Application")
	public void user_Verify_Successfully_Login_Into_Application() {

		System.out.println("working Fine");
	}



}
