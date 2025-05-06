package de.ldbv.gewan.client.bdt.cucumber.tutorial;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
// use Cucumber test engine
@IncludeEngines("cucumber")
// path to feature files
@SelectClasspathResource("features/client")
// steps definition
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "de.ldbv.gewan.client.bdt.cucumber.tutorial")

public class RunCucumberTest {
}
