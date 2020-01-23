package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_Steps {
	WebDriver driver;
	TestContext testContext;
	RegisterPage registerPage;

	public Register_Steps(TestContext context) {
		this.driver = driver;
		testContext = context;
		registerPage = testContext.getPageObjectManager().getRegisterPage();
	}

	@And("^Fill in the fields correctly$")
	public void fill_in_the_fields_correctly() {
		registerPage.fill_PersonalDetails();
	}

	@Then("^Registration is done$")
	public void registration_is_made() {
		registerPage.click_Agree();
		registerPage.click_Register();

	}

	@When("^Fill in the fields incorrectly$")
	public void fill_in_the_fields_incorrectly() {
		registerPage.fill_PersonalDetailsIncorrectly();
	}

	@Then("^Registration it's not done$")
	public void registration_it_s_not_done() {
		registerPage.click_Agree();
		registerPage.click_Register();
		registerPage.rolagem();
	}

}
