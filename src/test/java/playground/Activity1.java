package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity1 {

  private WebDriver webDriver;


    @BeforeMethod
public void SetupBrowser(){
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

    @Test
    public void FacebookTest(){
        String Title = webDriver.getTitle();
        Assert.assertEquals(Title,"Facebook - log in or sign up");
    }


    @AfterMethod
    public void CleanUpTest(){
        webDriver.quit();
    }
}
