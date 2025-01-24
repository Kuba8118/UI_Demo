package demoqa.textBoxTest.page;

import demoqa.driver.Driver;
import demoqa.helper.WebElementActions;
import demoqa.textBoxTest.page.users.AddUserPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {
    public WebElementActions webElementActions = new WebElementActions();



    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
