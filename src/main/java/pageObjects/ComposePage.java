package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposePage extends BasePage {

    @FindBy(xpath = "//android.view.ViewGroup//android.widget.EditText")
    private WebElement recipientAddressInputField;

    @FindBy(id = "subject")
    private WebElement subjectInputField;

    @FindBy(xpath = "//android.webkit.WebView/android.widget.EditText")
    private WebElement textInputField;

    @FindBy(id = "//send")
    private WebElement sendLetterButton;

    public ComposePage inputRecipientAddressField(String address){
        recipientAddressInputField.sendKeys(address);
        return this;
    }

    public ComposePage inputSubjectField(String subject){
        subjectInputField.sendKeys(subject);
        return this;
    }

    public ComposePage inputTextField(String text){
        textInputField.sendKeys(text);
        return this;
    }

    public ComposePage clickSendLetterButton() {
        sendLetterButton.click();
        return this;
    }


}

