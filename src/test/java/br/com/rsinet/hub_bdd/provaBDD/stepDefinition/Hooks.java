package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.provaBDD.selenium.Wait;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	WebDriver driver;
	TestContext testContext;
	WebDriverManager manager;

	public Hooks(TestContext context) {
		testContext = context;
		manager = testContext.getWebDriverManager();
		driver = manager.getDriver();
	}

	@Before
	public void BeforeSteps() {
		manager.getDriver();
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {
		Wait.waitForPageLoad(driver);
		Wait.untilJqueryIsDone(driver);
		Wait.untilPageLoadComplete(driver);

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
				.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(System.getProperty("user.dir") + "/target/" + screenshotName + ".png");

		Files.copy(sourcePath, destinationPath);

		Reporter.addScreenCaptureFromPath(destinationPath.toString());
	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}

}
