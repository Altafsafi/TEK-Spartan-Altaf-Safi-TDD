package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activity1 {


    @Test
    public void FacebookTest(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        String title = webDriver.getTitle();
        System.out.println(title);
    }
}
