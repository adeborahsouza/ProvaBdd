package br.com.rsinet.hub_bdd.provaBDD.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.provaBDD.managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "br.com.rsinet.hub_bdd.provaBDD.stepDefinition", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter: target/cucumber-reports/report.html" })

public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}