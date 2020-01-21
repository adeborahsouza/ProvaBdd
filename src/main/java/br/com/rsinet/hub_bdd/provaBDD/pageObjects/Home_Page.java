package br.com.rsinet.hub_bdd.provaBDD.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.provaBDD.Managers.FileReaderManager;
import br.com.rsinet.hub_bdd.provaBDD.dataProviders.ConfigFileReader;

public class Home_Page {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement btn_menuUser;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement btn_register;

	public void menuUser() {
		btn_menuUser.click();
	}

	public void btnRegister() {
		btn_register.sendKeys(Keys.ENTER);
	}

	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

}