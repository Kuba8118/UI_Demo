package delivery;

import demoqa.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class BaseDemoQa {
    public WebDriver driver;


    @BeforeSuite
    public void beforeSuite(){
        driver = Driver.getDriver();
    }
}

