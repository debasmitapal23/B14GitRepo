package com.basic.differentfolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		features={"src/test/resources/com/basic/differentfolderff/"},
		glue={"com/basic/differentfolder/"}
		
		)

public class runnerTest {

}
