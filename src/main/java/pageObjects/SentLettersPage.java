package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentLettersPage extends BasePage {

    @FindBy(xpath = "android.widget.ImageButton")
    private WebElement imageButton;

    @FindBy(id = "count")
    private WebElement sentLettersIndex;

    public SentLettersPage clickImageButton() {
        imageButton.click();
        return this;
    }

    public String getSentLettersCount() {
        return sentLettersIndex.getText();
    }


}
