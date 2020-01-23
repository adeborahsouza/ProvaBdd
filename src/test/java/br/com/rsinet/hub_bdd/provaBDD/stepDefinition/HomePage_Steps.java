package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.Home_Page;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.Product_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePage_Steps {
	WebDriver driver;
	TestContext testContext;
	Product_Page productPage;
	Home_Page homePage;

	public HomePage_Steps(TestContext context) {

		testContext = context;
		homePage = testContext.getPageObjectManager().getHome_Page();
	}

	@Given("^User is on Home Page$")
	public void userIsOnHomePage() {
		homePage.navigateTo_HomePage();
	}

	@When("^User navigate  to Register Page$")
	public void user_navigate_to_Register_Page() {
		homePage.menuUser();
		homePage.btnRegister();
	}

	@When("^look for a product in the box search$")
	public void look_for_a_product_in_the_box_search() throws InterruptedException {
		homePage.clickMenuSearch();
		homePage.fill_search();
		homePage.close_Search();
	}

	@When("^look for a product nonexistent in the box search$")
	public void look_for_a_product_nonexistent_in_the_box_search() {
		homePage.clickMenuSearch();
		homePage.fill_search_invalido();
	}

	@When("^Click in product in home$")
	public void click_in_product_in_home() {
		homePage.ImagemProduto();
	}

	@When("^Click in invalid product in home")
	public void click_in_invalid_product_in_home() {
		homePage.ProdutoFolio();
	}

}
