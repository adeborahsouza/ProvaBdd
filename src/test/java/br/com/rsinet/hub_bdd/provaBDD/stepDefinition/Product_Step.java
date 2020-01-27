package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.Product_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Product_Step {

	WebDriver driver;
	TestContext testContext;
	Product_Page productPage;
	WebDriverManager manager;

	public Product_Step(TestContext context) {
		testContext = context;
		productPage = testContext.getPageObjectManager().getProductPage();
	}

	@Then("^pesquisa e feita$")
	public void pesquisa_e_feita() throws InterruptedException {
		productPage.enter_produto();

		productPage.btn_cart();
	}

	@Then("^pesquisa nao e feita$")
	public void pesquisa_nao_e_feita() throws InterruptedException {
		productPage.checkNaoEncontrado();
		productPage.wait_televisao();

	}
	
	@And("^clica em um produto$")
	public void clica_em_um_produto() {
		productPage.enter_produto();
		productPage.btn_cart();
	}


}
