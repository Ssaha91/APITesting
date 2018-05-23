package steps;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.APIPage;
import pages.LoginPage;
import utils.ConfigFileReader;

import static org.testng.AssertJUnit.assertTrue;

public class LoginSteps {

    private ConfigFileReader configFileReader;
    private LoginPage user;

    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
        configFileReader = new ConfigFileReader();
        //user = new LoginPage(base.driver);
    }

    @Given("^User should click on my account$")
    public void userShouldClickOnMyAccount() {
        base.driver.navigate().to(configFileReader.getApplicationUrl());
        user.clickOnMyAccount();
    }


    @Then("^User shoold click on login button$")
    public void userShooldClickOnLoginButton() {
        user.clickOnSignInButton();
        //assertTrue(user.verifyWelcomeMessageDisplayed());
    }

    @When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterValidAnd(String username, String password) {

        
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        user.signInButtonAfterCredentials();
    }

    @Then("^I logged into HomeDepot$")
    public void iLoggedIntoHomeDepot() {

    }

    @When("^I enter valid username and password$")
    public void iEnterValidUsernameAndPassword() throws Throwable {
        user.enterUsername(configFileReader.getUsername());
        user.enterPassword(configFileReader.getPassword());
    }

    @Then("^I should see welcome txt$")
    public void iShouldSeeWelcomeTxt() throws Throwable {
        assertTrue(user.verifyWelcomeMessageDisplayed());
    }

    @Given("^User navigate to google distance matrix api$")
    public void userNavigateToGoogleDistanceMatrixApi() {
        new APIPage().responseVerification();
    }

    @Then("^then user should be able to validate the statuscode$")
    public void thenUserShouldBeAbleToValidateTheStatuscode() {
        new APIPage().statusCodeVerification();
    }
}
