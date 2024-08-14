package tek.tdd.utility;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;
import static tek.tdd.base.base.BaseSetup.WAIT_TIME_IN_SECOND;

public class SeleniumUtility {
    private WebDriverWait getWait()  {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT_TIME_IN_SECOND));
    }
}
