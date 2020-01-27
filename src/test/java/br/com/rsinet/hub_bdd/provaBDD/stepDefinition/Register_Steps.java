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

	@And("^preencher os campos corretamente$")
	public void preencher_os_campos_corretamente () {
		registerPage.fill_PersonalDetails();
	}

	@Then("^registro e feito$")
	public void registro_e_feito() {
		registerPage.click_Agree();
		registerPage.click_Register();

	}

	@When("^preencher os campos incorretamente$")
	public void preencher_os_campos_incorretamente() {
		registerPage.fill_PersonalDetailsIncorrectly();
	}

	@Then("^registro nao e feito$")
	public void registro_nao_e_feito() {
		registerPage.click_Agree();
		registerPage.click_Register();
		registerPage.rolagem();
	}

}
