package cucumberJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Annotation {
    WebDriver driver = null;
    @Given("^I have open the browser$")
    public void openBrowser() {
//      driver = new FirefoxDriver(); 
//   driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @When("^I open Facebook website$")
    public void goToFacebook() {
        driver.navigate().to("https://www.facebook.com/");
    }
    @Then("^Login button should exits$")
    public void loginButton() {
        if (driver.findElement(By.xpath("//button[@name='login']")).isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
        driver.close();
    }
}