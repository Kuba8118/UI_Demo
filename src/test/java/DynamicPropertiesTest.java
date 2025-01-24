import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DynamicPropertiesTest extends  BaseDemoQATest {

    @Test
    public void dynamicPropertiesTest() {
        driver.get("https://demoqa.com/dynamic-properties");
        dynamicPropertiesPage.clickColorChange();
        WebElement colorChangeButton = driver.findElement(By.xpath("//button[@id='colorChange']"));
        String actualColor = colorChangeButton.getCssValue("color");
        String actualColorHex = Color.fromString(actualColor).asHex();
        String expectedColorHex = "#dc3545";
        Assert.assertEquals(actualColorHex,expectedColorHex, "Не совпадает с ожиданием");

    }

}
