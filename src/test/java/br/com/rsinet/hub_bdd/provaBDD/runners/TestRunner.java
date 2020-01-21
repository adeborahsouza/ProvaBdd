package br.com.rsinet.hub_bdd.provaBDD.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "br.com.rsinet.hub_bdd.provaBDD.stepDefinition")

public class TestRunner {

}