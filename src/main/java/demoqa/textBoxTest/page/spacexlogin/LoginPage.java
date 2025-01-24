package demoqa.textBoxTest.page.spacexlogin;

import demoqa.textBoxTest.page.BasePage;
import demoqa.textBoxTest.page.dashboard.DashboardPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    public WebElement login;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submit;

    public DashboardPage doLogin(String username, String password) {
    webElementActions.sendKeys(login, username)
            .sendKeys(this.password,password)
            .click(submit);
    return new DashboardPage();
    }
}
