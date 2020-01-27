package br.com.rsinet.hub_bdd.provaBDD.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import br.com.rsinet.hub_bdd.provaBDD.dataProviders.ConfigFileReader;

public class RegisterPage {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtbx_Username;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txtbx_Email;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txtbx_Senha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txtbx_ConfSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txtbx_Name;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txtbx_LastName;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement txtbx_Phone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement txtbx_Country;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement txtbx_City;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement txtbx_Address;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement txtbx_Region;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement txtbx_PostalCode;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement btn_Agree;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btn_Conf;

	public void enter_UserName(String userName) {
		txtbx_Username.sendKeys(userName);
	}

	public void enter_Email(String email) {
		txtbx_Email.sendKeys(email);
	}

	public void enter_Senha(String senha) {
		txtbx_Senha.sendKeys(senha);
	}

	public void enter_ConfSenha(String confSenha) {
		txtbx_ConfSenha.sendKeys(confSenha);
	}

	public void enter_Name(String name) {
		txtbx_Name.sendKeys(name);
	}

	public void enter_LastName(String lastName) {
		txtbx_LastName.sendKeys(lastName);
	}

	public void enter_Phone(String phone) {
		txtbx_Phone.sendKeys(phone);
	}

	public void select_Country(String country) {
		Select selectCountry = new Select(txtbx_Country);
		selectCountry.selectByVisibleText(country);
	}

	public void enter_City(String city) {
		txtbx_City.sendKeys(city);
	}

	public void enter_Adress(String adress) {
		txtbx_Address.sendKeys(adress);
	}

	public void enter_Region(String region) {
		txtbx_Region.sendKeys(region);
	}

	public void enter_PostalCode(String postalCode) {
		txtbx_PostalCode.sendKeys(postalCode);
	}

	public void click_Agree() {
		btn_Agree.click();
	}

	public void click_Register() {
		btn_Conf.click();
	}

	public void rolagem() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,100)");
	}

	public void fill_PersonalDetails() {
		enter_UserName("celsobonitinhu");
		enter_Email("adeborahsouza@gmail.com");
		enter_Senha("68335740Bf");
		enter_ConfSenha("68335740Bf");
		enter_Name("Deborah");
		enter_LastName("Souza");
		enter_Phone("11984193082");
		select_Country("Brazil");
		enter_City("Osasco");
		enter_Adress("Rua Joaquim Rodrigues, 24");
		enter_Region("São Paulo");
		enter_PostalCode("06240-122");

	}

	public void fill_PersonalDetailsIncorrectly() {
		enter_UserName("adeborahsoaaaaaauza");
		enter_Email("adeborahsouza@gmail.com");
		enter_Senha("68335740Bf");
		enter_ConfSenha("68335740Bf");
		enter_Name("Deborah");
		enter_LastName("Souza");
		enter_Phone("11984193082");
		select_Country("Brazil");
		enter_City("Osasco");
		enter_Adress("Rua Joaquim Rodrigues, 24");
		enter_Region("São Paulo");
		enter_PostalCode("06240-122");

	}
}
