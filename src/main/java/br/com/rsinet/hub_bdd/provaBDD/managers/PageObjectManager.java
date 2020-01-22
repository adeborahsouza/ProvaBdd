package br.com.rsinet.hub_bdd.provaBDD.managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.provaBDD.pageObjects.Home_Page;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.Product_Page;
import br.com.rsinet.hub_bdd.provaBDD.pageObjects.RegisterPage;

public class PageObjectManager {
	private WebDriver driver;

	private Home_Page homePage;

	private RegisterPage registerPage;
	
	private Product_Page productPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public Home_Page getHome_Page() {

		return (homePage == null) ? homePage = new Home_Page(driver) : homePage;

	}

	public RegisterPage getRegisterPage() {

		return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;

	}
	
	public Product_Page getProductPage() {

		return (productPage == null) ? productPage = new Product_Page(driver) : productPage;

	}
}
