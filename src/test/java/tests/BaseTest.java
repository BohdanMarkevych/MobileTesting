package tests;

import driver.AndroidDriverSingleton;
import org.testng.annotations.AfterTest;

public class BaseTest {

    @AfterTest
    public void quitAndroidDriver() {
        AndroidDriverSingleton.quitAndroidDriver();
    }

}
