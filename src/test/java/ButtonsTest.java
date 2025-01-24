import demoqa.helper.WebElementActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseDemoQATest{

    @Test
    public void buttonsPage(){
        driver.get("https://demoqa.com/buttons");
        webElementActions.doubleClick(buttonsPage.doubleClickBtn);

        String expectedDoubleClickMessage = "Double Click Me";
        String actualDoubleClickMessage = buttonsPage.doubleClickBtn.getText();
        Assert.assertEquals(actualDoubleClickMessage, expectedDoubleClickMessage);



    }
    @Test
    public void buttonsPage2(){
        driver.get("https://demoqa.com/buttons");
        webElementActions.rightClick(buttonsPage.rightClickBtn);

        String expectedRightClickMessage2 = "Right Click Me";
        String actualRightClickMessage2 = buttonsPage.rightClickBtn.getText();
        Assert.assertEquals(actualRightClickMessage2,expectedRightClickMessage2);
    }
}
