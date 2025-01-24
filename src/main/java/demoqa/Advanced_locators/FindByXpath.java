package demoqa.Advanced_locators;
import delivery.BaseDemoQa;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindByXpath extends BaseDemoQa {
    @BeforeClass
    public void beforeClass(){
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterClass
    public void afterClass(){
        driver.close();
        driver.quit();
    }

    @Test()
    public void FindByXpathTest(){

    }

}
// //input[@type='text' and @id='userName']
// //input[@type='text' and @id='userName' and@placeholder='Full Name']
// a[starts-with
////div[@class='popular__list']/a/following-sibling::a[5]