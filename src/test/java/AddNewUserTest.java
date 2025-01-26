import demoqa.entity.User;
import demoqa.fileUtils.ConfigReader;
import demoqa.textBoxTest.page.users.AddUserPage;
import demoqa.utils.RandonEntityUtils.RandomUserGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewUserTest extends BaseDemoQATest {

    @Test
    public void addNewUserTest() {

        driver.get("https://spacexxx.talentlms.com/index");

        User randomUser = randomUserGenerator.randomUser();

        boolean isSuccessMessageVisible = loginPage.doLogin(ConfigReader.getProperty("userName"),ConfigReader.getProperty("password"))
                .mooveToProfile()
                .navigateToAddUserPage()
                .addUser(randomUser)
                .isSuccessMessageVisible();
        Assert.assertTrue(isSuccessMessageVisible);
    }

    @Test
    public void WrongUserTest() {

        driver.get("https://spacexxx.talentlms.com/index");

        User randomUser = randomUserGenerator.randomUser();
        randomUser.setUsername(randomUserGenerator.randomUserNameMoreLimit());

        boolean isSuccessMessageVisible = loginPage.doLogin(ConfigReader.getProperty("userName"),ConfigReader.getProperty("password"))
                .mooveToProfile()
                .navigateToAddUserPage()
                .addWrongUser(randomUser)
                .isNotValidUserName();
        Assert.assertTrue(isSuccessMessageVisible);
    }

    @Test
    public void WrongUserPasswordTest() {

        driver.get("https://spacexxx.talentlms.com/index");

        User randomUser = randomUserGenerator.randomUser();
        randomUser.setPassword(randomUserGenerator.randomUserWrongPassword());

        boolean isSuccessMessageVisible = loginPage.doLogin(ConfigReader.getProperty("userName"),ConfigReader.getProperty("password"))
                .mooveToProfile()
                .navigateToAddUserPage()
                .addWrongUser(randomUser)
                .WrongPasswordUserName();
        Assert.assertTrue(isSuccessMessageVisible);
    }

    @Test
    public void NullUserTest() {

        driver.get("https://spacexxx.talentlms.com/index");

        User randomUser = randomUserGenerator.nullUser();

        AddUserPage addUserPage1 = loginPage.doLogin(ConfigReader.getProperty("userName"),ConfigReader.getProperty("password"))
                .mooveToProfile()
                .navigateToAddUserPage()
                .addNullUser(randomUser);
        boolean isNullFirstName111 = addUserPage1
                .nullFirstName();
        Assert.assertTrue(isNullFirstName111);

        boolean isNullLastName111 = addUserPage1
                .nullLastName();
        Assert.assertTrue(isNullLastName111);

        boolean isNullUserName111 = addUserPage1
                .nullUserName();
        Assert.assertTrue(isNullUserName111);

        boolean isNullEmail111 = addUserPage1
                .nullEmail();
        Assert.assertTrue(isNullEmail111);
    }

}
