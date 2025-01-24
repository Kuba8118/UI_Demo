import demoqa.driver.Driver;
import demoqa.helper.BrowserManager;
import demoqa.helper.WebElementActions;
import demoqa.textBoxTest.page.*;
import demoqa.textBoxTest.page.dashboard.DashboardPage;
import demoqa.textBoxTest.page.spacexlogin.LoginPage;
import demoqa.textBoxTest.page.users.AddUserPage;
import demoqa.utils.RandonEntityUtils.RandomUserGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class BaseDemoQATest {
    public WebDriver driver;
    TextBoxPage textBoxPage = new TextBoxPage();
    DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage();
    WebElementActions webElementActions = new WebElementActions();
    ButtonsPage buttonsPage = new ButtonsPage();
    CheckBoxPage1 checkBoxPage1 = new CheckBoxPage1();
    AlertPage alertPage = new AlertPage();
    BrowserManager browserManager = new BrowserManager(driver);

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    AddUserPage addUserPage = new AddUserPage();
    RandomUserGenerator randomUserGenerator = new RandomUserGenerator();



    @BeforeSuite
    public void beforeSuite(){
        driver = Driver.getDriver();
    }
}
