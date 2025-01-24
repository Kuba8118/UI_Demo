package demoqa.textBoxTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage{
//    protected WebDriver driver;

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;


}
