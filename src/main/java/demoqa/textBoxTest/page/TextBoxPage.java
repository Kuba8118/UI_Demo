package demoqa.textBoxTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {
    protected WebDriver driver;

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submit;

    public TextBoxPage fillUserName(String userName){
        this.userName.sendKeys(userName);
        return this;
    }
    public TextBoxPage fillUserEmail(String userEmail){
        this.userEmail.sendKeys(userEmail);
        return this;
    }
    public TextBoxPage fillCurrentAddress(String currentAddress){
        this.currentAddress.sendKeys(currentAddress);
        return this;
    }
    public TextBoxPage fillPermanentAddress(String permanentAddress){
        this.permanentAddress.sendKeys(permanentAddress);
        return this;
    }
    public TextBoxPage clickSubmit(){
        webElementActions.scrollToElement(this.submit);
        return this;
    }
}
