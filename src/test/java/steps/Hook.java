package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.ConfigFileReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Hook extends BaseUtil {

    public static final String USERNAME = "YOUR_USERNAME";
    public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

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

        if (configFileReader.doApiTesting().equalsIgnoreCase("true")) {
            System.out.println("Running API Test");

            RestAssured.baseURI = configFileReader.getAPIBaseURI();
            RestAssured.basePath = configFileReader.getAPIBasePath();
        } else {
            if (configFileReader.getSauceLabs().equalsIgnoreCase("true")) {
                initiateSauceLabs();
            } else if (configFileReader.getLocalDriver().equalsIgnoreCase("true")) {
                if (configFileReader.getDriverPath().contains("chrome")) {
                    startChrome();
                } else if (configFileReader.getDriverPath().contains("gecko")) {
                    startFirefox();
                } else if (configFileReader.getDriverPath().contains("IE")) {
                    startInternetExplorer();
                }
            }
        }
    }

    private void startInternetExplorer() {
        System.setProperty("webdriver.ie.driver", configFileReader.getDriverPath());
        DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
        dc.setCapability("ignoreZoomSetting", true);
        //dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        //dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        //dc.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
        base.driver = new InternetExplorerDriver(dc);
        base.driver.manage().window().maximize();
        //base.driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        //base.driver.manage().deleteAllCookies();
    }

    private void startFirefox() {
        System.setProperty("webdriver.gecko.driver", configFileReader.getDriverPath());
        base.driver = new FirefoxDriver();
        base.driver.manage().window().maximize();
        //base.driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        base.driver.manage().deleteAllCookies();
    }

    private void startChrome() {
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
        //base.driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        base.driver.manage().deleteAllCookies();
    }

    private void initiateSauceLabs() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");

        try {
            base.driver = new RemoteWebDriver(new URL(URL), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @After
    public void TearDownTest(Scenario scenario) {

        if (scenario.isFailed()) {
            // Take Screenshot
            System.out.println(scenario.getName());
        }

        if (configFileReader.doApiTesting().equalsIgnoreCase("true")) {
            System.out.println("API Testing Ended");
        } else {
            base.driver.quit();
        }
    }
}
