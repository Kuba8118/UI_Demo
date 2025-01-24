package demoqa.basicLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FindByID {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("John Doe");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("john.doe@gmail.com");

        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys("123 Main St");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("312 Bishkek city");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();



        driver.close();
        driver.quit();

    }
}
