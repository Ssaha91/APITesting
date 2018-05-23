package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageObject {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    WebElement a;

    public void testing() {

    }
}
