package br.com.rsinet.hub_bdd.provaBDD.cucumber;

import br.com.rsinet.hub_bdd.provaBDD.Managers.PageObjectManager;
import br.com.rsinet.hub_bdd.provaBDD.Managers.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}