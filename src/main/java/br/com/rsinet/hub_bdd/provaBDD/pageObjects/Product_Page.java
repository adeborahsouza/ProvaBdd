package br.com.rsinet.hub_bdd.provaBDD.pageObjects;

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

	@FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/div/div")
	private WebElement closeSearch;

	public void close_Search() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("Laptop"));
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", closeSearch);
	}

	public void enter_produto(){
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btn_produto);
	}
}
