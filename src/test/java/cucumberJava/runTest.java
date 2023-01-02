package cucumberJava;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber.html",
        "json:target/cucumber.json", "junit:target/cucumber.xml" }, monochrome = true)
public class runTest {}