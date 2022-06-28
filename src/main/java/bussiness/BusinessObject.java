package bussiness;

import pageObjects.ComposePage;
import pageObjects.InitialPage;
import pageObjects.SentLettersPage;

public class BusinessObject {
    private final long DEFAULT_TIME_TO_WAIT = 60;

    private final InitialPage initialPage = new InitialPage();
    private final ComposePage composePage = new ComposePage();
    private final SentLettersPage sentLettersPage = new SentLettersPage();


    public void checkCountOfLettersAfterSending(String recipientAddress, String subjectOfLetter,
                                                String textOfLetter, String expectedCountOfLetters) {
        initialPage.clickComposeButton();
        composePage.implicitWait(DEFAULT_TIME_TO_WAIT);
        composePage.inputRecipientAddressField(recipientAddress)
                .inputSubjectField(subjectOfLetter)
                .inputTextField(textOfLetter)
                .clickSendLetterButton();
        sentLettersPage.implicitWait(DEFAULT_TIME_TO_WAIT);
        sentLettersPage.clickImageButton().implicitWait(DEFAULT_TIME_TO_WAIT);
        sentLettersPage.getSentLettersCount();
        assert (sentLettersPage.getSentLettersCount().equals(expectedCountOfLetters));
    }
}
