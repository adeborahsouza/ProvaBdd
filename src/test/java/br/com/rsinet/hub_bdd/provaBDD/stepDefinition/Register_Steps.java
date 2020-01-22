package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import br.com.rsinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_Steps {
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	TestContext testContext;
	RegisterPage registerPage;

	public Register_Steps(TestContext context) {
		testContext = context;
		registerPage = testContext.getPageObjectManager().getRegisterPage();
	}

	@And("^Fill in the fields correctly$")
	public void fill_in_the_fields_correctly() {
		registerPage.fill_PersonalDetails();
		Log.info("Preenchendo os campos corretamente na página de cadastro.");
	}

	@Then("^Registration is done$")
	public void registration_is_made() {
		registerPage.click_Agree();
		registerPage.click_Register();
		Log.info("Aceitando os termos e clicando em registar.");
		
	}

	@When("^Fill in the fields incorrectly$")
	public void fill_in_the_fields_incorrectly() {
		registerPage.fill_PersonalDetailsIncorrectly();
		Log.info("Preenchendo os campos incorretamente na página de cadastro.");
	}

	@Then("^Registration it's not done$")
	public void registration_it_s_not_done() {
		registerPage.click_Agree();
		registerPage.click_Register();
		Log.info("Aceitando os termos e clicando em registar.");
		assertEquals("http://advantageonlineshopping.com/#/register", driver.getCurrentUrl());
	}

}
