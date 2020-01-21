package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import br.com.rsinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.Home_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePage_Steps {

	TestContext testContext;
	Home_Page homePage;

	public HomePage_Steps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHome_Page();
	}

	@Given("^User is on Home Page$")
	public void userIsOnHomePage()  {
		homePage.navigateTo_HomePage();
	}

	@When("^User navigate  to Register Page$")
	public void user_navigate_to_Register_Page() {
		homePage.menuUser();
		homePage.btnRegister();
	}

}
