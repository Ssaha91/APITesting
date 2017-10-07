package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "email")
    WebElement usernameField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//input[@type='text']")
    WebElement areTextBoxesPresent;

    @FindBy(xpath = "//a[@id='not_me_link']")
    WebElement isNotYouPresent;

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
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
        if (isNotYouPresent.isDisplayed()) {
            System.out.println("Test Case Passed");
        } else {
            System.err.println("Failed Test Case");
        }
    }
}