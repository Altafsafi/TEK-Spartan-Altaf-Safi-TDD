package playground;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {

    @BeforeClass
    public void runBeforeTestClass(){
        System.out.println("This is only 1 Time per Test Class");
    }
    @BeforeMethod
    public void runBeforeTest(){
        System.out.println("This is Before Each Test");
    }

    @Test
    public void myFirstTestMethod(){
        System.out.println("Hello world");
    }
    @Test
    public void mySecondTestMethod(){
        System.out.println("Hello County");

    }





    @AfterMethod
    public void runAfterEachTestMethod(){
        System.out.println("This is running after Each test");
    }
}
