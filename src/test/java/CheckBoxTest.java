import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckBoxTest extends BaseDemoQATest {

    @Test
    public void checkBoxTest() {

        driver.get("https://demoqa.com/checkbox");
        checkBoxPage1.clickTreeHome()
                .clickDesktop()
                .clickDocuments()
                .clickDowloads()
                .clickDesktopNotes()
                .clickDesktopCommands()
                .clickDocumentsWorkSpace()
                .clickDocumentsOffice()
                .clickDownloadsWordFileDoc()
                .clickDownloadsExcelFileDoc();

        String assertResultClicks = checkBoxPage1.resultClick.getText();
        Assert.assertEquals(assertResultClicks,"You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile\n");
        checkBoxPage1.clickDownloadsExcelFileDoc()
                .clickDownloadsWordFileDoc()
                .clickDocumentsOffice()
                .clickDocumentsWorkSpace()
                .clickDesktopCommands()
                .clickDesktopNotes()
                .clickDowloads()
                .clickDocuments()
                .clickDesktop()
                .clickTreeHome();
    }
}
