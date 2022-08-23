package org.example.Runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "org.example.stepDefinitions",
        tags = "@smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
