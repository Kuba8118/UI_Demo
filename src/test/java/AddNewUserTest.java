import demoqa.entity.User;
import demoqa.fileUtils.ConfigReader;
import org.testng.annotations.Test;

public class AddNewUserTest extends BaseDemoQATest {

    @Test
    public void addNewUserTest() throws InterruptedException {

        driver.get("https://spacexxx.talentlms.com/index");

        User randomUser = randomUserGenerator.randomUser();

        loginPage.doLogin(ConfigReader.getProperty("userName"),ConfigReader.getProperty("password"));
//                .mooveToPrifule()
//                .navigateToAddUserPage()
//                .addUser(randomUser);
    }
}
