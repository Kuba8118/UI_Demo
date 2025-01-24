import demoqa.textBoxTest.page.AlertPage;
import org.testng.annotations.Test;

public class AlertTest extends BaseDemoQATest{
    @Test
    public void alertTest(){
        driver.navigate().to("https://demoqa.com/alerts");
        webElementActions.click(alertPage.alertButton);

    }
}