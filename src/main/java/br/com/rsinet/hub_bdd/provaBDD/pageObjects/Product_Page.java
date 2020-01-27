package br.com.rsinet.hub_bdd.provaBDD.pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_bdd.provaBDD.dataProviders.ConfigFileReader;

public class Product_Page {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public Product_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "HP ElitePad 1000 G2 Tablet")
	private WebElement btn_produto;


	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement btn_cart;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div")
	private WebElement wait_televisao;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/label/span")
	private WebElement naoEncontrado;
	
	public void enter_produto() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btn_produto);
	}

	public void btn_cart() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(btn_cart));
	}
	
	public void checkNaoEncontrado() {
		assertEquals(naoEncontrado.getText().contains("No results for"), true);
	}
	
	public void wait_televisao() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(wait_televisao));
	}
}
