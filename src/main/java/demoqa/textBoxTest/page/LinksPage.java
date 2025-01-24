package demoqa.textBoxTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksPage extends BasePage{
    protected WebDriver driver;

    @FindBy(id = "simpleLink")
    public WebElement simpleLink;

    @FindBy(id = "dynamicLink")
    public WebElement dynamicLink;

    @FindBy(id = "created")
    public WebElement created;

    @FindBy(id = "no-content")
    public WebElement noContent;

    @FindBy(id = "moved")
    public WebElement moved;

    @FindBy(id = "bad-request")
    public WebElement badRequest;

    @FindBy(id = "unauthorized")
    public WebElement unauthorized;

    @FindBy(id = "forbidden")
    public WebElement forbidden;

    @FindBy(id = "invalid-url")
    public WebElement invalidUrl;

}
