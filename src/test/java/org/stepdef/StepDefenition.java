package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefenition {
	public WebDriver driver;
	@Given("User lanches facebook application")
	public void user_lanches_facebook_application() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@When("User enters valid {string}")
	public void user_enters_valid(String username) {
	    driver.findElement(By.id("email")).sendKeys(username);
	}

	@When("User enters the valid {string}")
	public void user_enters_the_valid(String password) {
	    driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("User validates successfull login")
	public void user_validates_successfull_login() {
	    System.out.println("Completed");
	    System.out.println("line added by a");
	    System.out.println("line added by a1");
	    System.out.println("line added by a2");
	    System.out.println("b updated");
	    System.out.println("b1 updated");
	    System.out.println("b2 updated");
	    System.out.println("b3 updated");
	}
}
