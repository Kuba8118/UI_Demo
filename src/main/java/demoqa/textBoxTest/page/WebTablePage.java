package demoqa.textBoxTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage{
    protected WebDriver driver;

    @FindBy(id = "addNewRecordButton")
    public WebElement addNewRecordButton;

    @FindBy(id = "submit")
    public WebElement submit;
}
