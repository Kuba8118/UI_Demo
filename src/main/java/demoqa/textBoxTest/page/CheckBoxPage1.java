package demoqa.textBoxTest.page;

import demoqa.helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckBoxPage1 extends BasePage {

    @FindBy(xpath = "//label[@for='tree-node-home']/../button[@aria-label='Toggle']")
    public WebElement treeHome;

    @FindBy(xpath = "//label[@for='tree-node-desktop']/../button[@aria-label='Toggle']")
    public WebElement descTop;

    @FindBy(xpath = "//label[@for='tree-node-documents']/../button[@aria-label='Toggle']")
    public WebElement documents;

    @FindBy(xpath = "//label[@for='tree-node-downloads']/../button[@aria-label='Toggle']")
    public WebElement downloads;

    @FindBy(xpath = "//span[@class='rct-title' and text()='Notes']")
    public WebElement desktopNotes;

    @FindBy(xpath = "//span[@class='rct-title' and text()='Commands']")
    public WebElement desktopCommands;

    @FindBy(xpath = "//span[@class='rct-title' and text()='WorkSpace']")
    public WebElement documentsWorkSpace;

    @FindBy(xpath = "//span[@class='rct-title' and text()='Office']")
    public WebElement documentsOffice;

    @FindBy(xpath = "//span[@class='rct-title' and text()='Word File.doc']")
    public WebElement downloadsWordFileDoc;

    @FindBy(xpath = "//span[@class='rct-title' and text()='Excel File.doc']")
    public WebElement downloadsExcelFileDoc;

    @FindBy(id = "result")
    public WebElement resultClick;


    public CheckBoxPage1 clickTreeHome() {
        webElementActions.click(treeHome);
        return this;
    }

    public CheckBoxPage1 clickDesktop() {
        webElementActions.click(descTop);
        return this;
    }

    public CheckBoxPage1 clickDocuments() {
        webElementActions.click(documents);
        return this;
    }

    public CheckBoxPage1 clickDowloads() {
        webElementActions.click(downloads);
        return this;
    }

    public CheckBoxPage1 clickDesktopNotes() {
        webElementActions.click(desktopNotes);
        return this;
    }

    public CheckBoxPage1 clickDesktopCommands() {
        webElementActions.click(desktopCommands);
        return this;
    }

    public CheckBoxPage1 clickDocumentsWorkSpace() {
        webElementActions.click(documentsWorkSpace);
        return this;
    }

    public CheckBoxPage1 clickDocumentsOffice() {
        webElementActions.click(documentsOffice);
        return this;
    }

    public CheckBoxPage1 clickDownloadsWordFileDoc() {
        webElementActions.click(downloadsWordFileDoc);
        return this;
    }

    public CheckBoxPage1 clickDownloadsExcelFileDoc() {
        webElementActions.click(downloadsExcelFileDoc);
        return this;
    }

}





