package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_bdd.provaBDD.pageObjects.Home_Page;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_Steps {
	private static WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com/#/");
	}

	@Given("^User navigate  to Register Page$")
	public void user_navigate_to_Register_Page() {
		Home_Page home = new Home_Page(driver);

		home.menuUser();
		home.btnRegister();
	}

	@When("^Fill in the fields correctly$")
	public void fill_in_the_fields_correctly() {
		RegisterPage register = new RegisterPage(driver);
		register.fill_PersonalDetails();
	}

	@Then("^Registration is made$")
	public void registration_is_made() {
		RegisterPage register = new RegisterPage(driver);
		register.click_Agree();
		register.click_Register();
	}

	@When("^Fill in the fields incorrectly$")
	public void fill_in_the_fields_incorrectly() {
		RegisterPage register = new RegisterPage(driver);
		register.fill_PersonalDetailsIncorrectly();
	}

	@Then("^Registration it's not done$")
	public void registration_it_s_not_done() {
		RegisterPage register = new RegisterPage(driver);
		register.click_Agree();
		register.click_Register();
	}

}
