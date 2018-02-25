package runnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features = {"features"},glue = {"stepDefinationPackage"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	public static WebDriver driver;
	@BeforeTest
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		//Use webdriver manager to specify which driver to use
	    driver = new ChromeDriver();
	    System.out.println("Set up script running");
	}
	
}
