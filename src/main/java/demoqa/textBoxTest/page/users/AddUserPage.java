package demoqa.textBoxTest.page.users;

import demoqa.entity.User;
import demoqa.textBoxTest.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement login;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    public WebElement addUserButton;


    public void addUser(User user) {
        webElementActions.sendKeys(firstName, user.getFirstname())
                .sendKeys(lastName, user.getLastname())
                .sendKeys(login, user.getUsername())
                .sendKeys(email, user.getEmail())
                .sendKeys(password, user.getPassword())
                .click(addUserButton);
    }


}
