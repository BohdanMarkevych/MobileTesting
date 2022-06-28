package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialPage extends BasePage{

    @FindBy(id = "compose_button")
    private WebElement composeButton;

    public InitialPage clickComposeButton() {
        composeButton.click();
        return this;
    }

}
