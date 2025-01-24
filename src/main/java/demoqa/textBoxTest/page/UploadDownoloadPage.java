package demoqa.textBoxTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadDownoloadPage extends BasePage{
    protected WebDriver driver;

    @FindBy(id = "downloadButton")
    public WebElement downloadButton;

    @FindBy(id = "uploadFile")
    public WebElement uploadFile;

}