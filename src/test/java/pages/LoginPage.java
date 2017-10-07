package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement usernameField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//input[@type='text']")
    WebElement areTextBoxesPresent;

    @FindBy(xpath = "//a[contains(text(),'Recover Your Account')]")
    WebElement recoverAccountPresent;

    public void Login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        submitButton.click();
    }

    public void isDisplayedSuccessfulLogin() {
        if (areTextBoxesPresent.isDisplayed()) {
            System.out.println("Successfully Logged In, Test Case Passed");
        } else {
            System.err.println("Failed Test Case");
        }
    }

    public void isDisplayedFailureLogin() {
        if (recoverAccountPresent.isDisplayed()) {
            System.out.println("Test Case Passed");
        } else {
            System.err.println("Failed Test Case");
        }
    }
}