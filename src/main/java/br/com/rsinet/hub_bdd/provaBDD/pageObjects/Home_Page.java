package br.com.rsinet.hub_bdd.provaBDD.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	private static WebDriver driver;

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement btn_menuUser;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement btn_register;

	public void menuUser() {
		btn_menuUser.click();
	}

	public void btnRegister() {
		btn_register.click();
	}

	public void navigateTo_HomePage() {
		driver.get("http://advantageonlineshopping.com/");
	}

}