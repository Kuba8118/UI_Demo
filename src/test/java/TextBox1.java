
import demoqa.textBoxTest.page.TextBoxPage;
import org.testng.annotations.Test;

public class TextBox1 extends BaseDemoQATest {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void testTextBox(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillUserName("Admin Admin")
                .fillUserEmail("hgvfh@gmail.com")
                .fillCurrentAddress("312 Bishek")
                .fillPermanentAddress("453 Naryn")
                .clickSubmit();

    }
}
