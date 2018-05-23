package pages;

import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.restassured.RestAssured.given;

public class LoginPage extends PageObject {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    private WebDriverWait wait;
//
//    public LoginPage(WebDriver driver) {
//        wait = new WebDriverWait(driver, 10);
//        PageFactory.initElements(driver, this);
//    }

    @FindBy(id = "headerMyAccount")
    WebElement myAccount;

    @FindBy(xpath = "//*[@id='authSignIn']/a/span")
    WebElement signInButton;

    @FindBy(id = "email_id")
    WebElement nameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "//button[@id='accountSignIn']//span")
    WebElement signInButtonFrame;

    @FindBy(xpath = "//div[@id='headerMyAccountTitle']//span")
    WebElement welcomeMessage;

    public void clickOnMyAccount() {
        wait.until(ExpectedConditions.visibilityOf(myAccount));
        myAccount.click();
    }

    public void clickOnSignInButton() {
        wait.until(ExpectedConditions.visibilityOf(signInButton));
        signInButton.click();
    }

    public void enterUsername(String name){
        wait.until(ExpectedConditions.visibilityOf(nameField));
        nameField.sendKeys(name);
    }

    public void enterPassword(String psd){
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(psd);
    }

    public void signInButtonAfterCredentials() {
        wait.until(ExpectedConditions.visibilityOf(signInButtonFrame));
        signInButtonFrame.click();
    }

    public boolean verifyWelcomeMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        return welcomeMessage.isDisplayed();
    }

    //Google API demo purpose

    /**
    public void setUp(){
        RestAssured.baseURI = "https://maps.googleapis.com";
        RestAssured.basePath = "/maps/api";
    }
     */

    public void statusCodeVerification(){
        given()
                .param("units", "imperial")
                .param("origins", "Washington,DC")
                .param("destinations", "New+York+City,NY")
                .param("key", "AIzaSyDJCanQ624S8bIpdfOXHgnG8JiJJ2Y2FAI")
                .when()
                .get("/distancematrix/json")
                .then()
                .statusCode(200);
    }

}