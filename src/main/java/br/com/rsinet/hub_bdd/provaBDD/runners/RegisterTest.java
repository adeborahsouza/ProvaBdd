package br.com.rsinet.hub_bdd.provaBDD.runners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// selenium atualizado
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");

		// acessa o site do google
		driver.get("http://advantageonlineshopping.com/#/");

		// maximizar a tela
		driver.manage().window().maximize();

		// encontrando o elemento de user e clicando
		driver.findElement(By.id("menuUser")).click();

		// opção cadastro
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();

		// escrevendo username
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input"))
				.sendKeys("adeborahsouza");

		// escrevendo email
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input"))
				.sendKeys("adeborahsouza@gmail.com");

		// escrevendo senha
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input")).sendKeys("090714Bf");

		// confirmando senha
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input")).sendKeys("090714Bf");

//		// rola a página para baixo
//		JavascriptExecutor scroll = (JavascriptExecutor) driver;
//		scroll.executeScript("scrollBy(0,0300)", "");

		// escrevendo primeiro nome
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input")).sendKeys("Deborah");

		// escrevendo ultimo nome
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input")).sendKeys("Souza");

		// escrevendo telefone
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input")).sendKeys("11984193082");

		// rola a página para baixo
//		JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
//		scroll2.executeScript("scrollBy(0,0200)", "");

		// selecionando o pais
		Select oSelect = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		oSelect.selectByVisibleText("Brazil");

		// escrevendo cidade
		Thread.sleep(2000);
		driver.findElement(By.name("cityRegisterPage")).sendKeys("Osasco");

		// escrevendo endereço
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input"))
				.sendKeys("Rua Joaquim Rodrigues, 24");

		// escrevendo endereço
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input"))
				.sendKeys("São Paulo");

		// escrevendo cep
		Thread.sleep(2000);
		driver.findElement(By.xpath("// *[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input")).sendKeys("06240-122");

		// rola a página para baixo
//		JavascriptExecutor scroll3 = (JavascriptExecutor) driver;
//		scroll3.executeScript("scrollBy(0,0200)", "");

		// aceitando os termos
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/sec-view/div/input")).click();

		// aceitando os termos
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"register_btnundefined\"]\r\n")).click();

		driver.quit();

	}

}
