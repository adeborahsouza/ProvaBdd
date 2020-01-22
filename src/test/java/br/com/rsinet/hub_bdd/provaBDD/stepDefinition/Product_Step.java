package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.Product_Page;
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

	@Then("^Search is done$")
	public void search_is_done() throws InterruptedException {
		productPage.enter_produto();

	}
	
	@Then("^Search is not done$")
	public void search_is_not_done() throws InterruptedException {
		

	}

}
