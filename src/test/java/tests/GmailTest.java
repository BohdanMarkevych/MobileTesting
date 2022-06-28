package tests;

import business.BusinessObject;
import org.testng.annotations.Test;

public class GmailTest extends BaseTest {


    private static final String RECIPIENT_ADDRESS = "bohdantesting@gmail.com";
    private static final String LETTER_SUBJECT = "Checking Letter";
    private static final String LETTER_TEXT = "Simple Text";
    private static final String EXPECTED_RESULT = "1";

    private BusinessObject businessObject = new BusinessObject();

    @Test(description = "This test checks if the letter is sent")
    public void verifyThatLetterIsSent() {
        businessObject.checkCountOfLettersAfterSending(RECIPIENT_ADDRESS, LETTER_SUBJECT, LETTER_TEXT, EXPECTED_RESULT);
    }
}