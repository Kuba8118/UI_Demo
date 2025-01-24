package demoqa.textBoxTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage{
    protected WebDriver driver;

    @FindBy(id = "yesRadio")
    public WebElement yesRadio;

    @FindBy(id = "impressiveRadio")
    public WebElement impressiveRadio;

    @FindBy(id = "noRadio")
    public  WebElement noRadio;

}