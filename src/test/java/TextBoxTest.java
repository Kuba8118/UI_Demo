
import demoqa.textBoxTest.page.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseDemoQATest {
    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    public void textBoxTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        textBoxPage.userName.sendKeys("admin");
        textBoxPage.userEmail.sendKeys("admin@admin.com");
        textBoxPage.currentAddress.sendKeys("312 Bishkek");
        textBoxPage.permanentAddress.sendKeys(("123 Naryn"));
        textBoxPage.clickSubmit();
    }
}
