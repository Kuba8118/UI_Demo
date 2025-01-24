package demoqa.textBoxTest.page;

import demoqa.helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicPropertiesPage extends BasePage{


    @FindBy(id = "enableAfter")
    public WebElement enableAfter;

    @FindBy(id = "colorChange")
    public WebElement colorChange;

    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter;


    public DynamicPropertiesPage clickEnableAfter(){
        webElementActions.click(enableAfter);
        return this;
    }
    public DynamicPropertiesPage clickColorChange(){
        webElementActions.click(colorChange);
        return this;
    }
    public DynamicPropertiesPage clickVisibleAfter(){
        webElementActions.click(visibleAfter);
        return this;
    }

}
