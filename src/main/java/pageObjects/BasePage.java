package pageObjects;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

import static driver.AndroidDriverSingleton.getAndroidDriver;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(getAndroidDriver(), this);
    }

    public void implicitWait(long timeToWait) {
        getAndroidDriver().manage().timeouts().implicitlyWait(timeToWait, TimeUnit.SECONDS);
    }

}
