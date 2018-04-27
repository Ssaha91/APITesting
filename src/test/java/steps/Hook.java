package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.ConfigFileReader;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil {

    String browserChoice = "Chrome";
    //String browserChoice = "Firefox";
    //String browserChoice = "IE";

    /**
     * Define steps just like in CommonAPI for Web Automation.
     * @Before and @After Annotations are from Cucumber Dependency.
     *
     * In some classes I create an object from BaseUtil class,
     * and make a Constructor that passes BaseUtil as signature.
     * This is called Dependency Injection.
     */

    private ConfigFileReader configFileReader;

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() throws IOException {
        configFileReader = new ConfigFileReader();

        if (configFileReader.getDriverPath().contains("chrome")) {
            startChrome();
        } else if (configFileReader.getDriverPath().contains("gecko")) {
            startFirefox();
        } else if (configFileReader.getDriverPath().contains("IE")) {
            startInternetExplorer();
        }

    }

    private void startInternetExplorer() {
        System.setProperty("webdriver.ie.driver", configFileReader.getDriverPath());
        base.driver = new InternetExplorerDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        base.driver.manage().deleteAllCookies();

    }

    private void startFirefox() {
        System.setProperty("webdriver.gecko.driver", configFileReader.getDriverPath());
        base.driver = new FirefoxDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        base.driver.manage().deleteAllCookies();
    }

    private void startChrome() {
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        base.driver.manage().deleteAllCookies();
    }

    @After
    public void TearDownTest(Scenario scenario) {

        if (scenario.isFailed()) {
            // Take Screenshot
            System.out.println(scenario.getName());
        }
        base.driver.quit();
    }

}
