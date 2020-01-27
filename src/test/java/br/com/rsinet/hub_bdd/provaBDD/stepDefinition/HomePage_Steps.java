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

	@Given("^Usuario esta na home page$")
	public void Usuario_esta_na_home_page() {
		homePage.navigateTo_HomePage();
	}

	@When("^usuario navegar para a pagina de registro$")
	public void usuario_navegar_para_a_pagina_de_registro () {
		homePage.menuUser();
		homePage.btnRegister();
	}

	@When("^procurar por um produto existente na lupa$")
	public void procurar_por_um_produto_existente_na_lupa() throws InterruptedException {
		homePage.clickMenuSearch();
		homePage.fill_search();
		homePage.close_Search();
	}

	@When("^procurar por um produto inexistente na lupa$")
	public void procurar_por_um_produto_inexistente_na_lupa() {
		homePage.clickMenuSearch();
		homePage.fill_search_invalido();
	}

	@When("^clica em uma categoria da home$")
	public void clica_em_uma_categoria_da_home() {
		homePage.ImagemProduto();
	}

	@When("^clica em um produto invalido da home")
	public void clica_em_um_produto_invalido_da_home() {
		homePage.ProdutoFolio();
		homePage.btn_cart();
		
	}

}
