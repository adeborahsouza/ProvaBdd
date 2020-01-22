package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import br.com.rsinet.hub_bdd.provaBDD.cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void BeforeSteps() {

	}

	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}

}
