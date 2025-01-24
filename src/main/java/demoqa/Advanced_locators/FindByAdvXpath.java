package demoqa.Advanced_locators;

import delivery.BaseDemoQa;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindByAdvXpath extends BaseDemoQa {

    @BeforeClass
    public void beforeClass(){
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test(description = "Text box form by Xpath")
    public void findByAbsolutXpathTest(){
        driver.findElement(By.xpath("/html/body/link[2]")).sendKeys("John Doe");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    @AfterClass
    public void afterClass(){
        driver.close();
        driver.quit();
    }

}
