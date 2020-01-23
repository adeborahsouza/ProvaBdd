package br.com.rsinet.hub_bdd.provaBDD.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.hub_bdd.provaBDD.cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void BeforeSteps() {

	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) throws IOException {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
				.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(
				"C:\\Users\\deborah.souza\\eclipse-workspace\\ProvaBDD\\target\\cucumber-reports\\screenshots\\" + screenshotName + ".png");

		Files.copy(sourcePath, destinationPath);

		Reporter.addScreenCaptureFromPath(destinationPath.toString());
	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}

}
