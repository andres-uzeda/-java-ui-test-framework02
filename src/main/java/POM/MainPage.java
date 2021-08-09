package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    protected WebDriver webDriver;

    private By completeWebFormMenu = By.cssSelector("body > div > div > li:nth-child(18) > a");

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebFormPage SelectCompleteWebFormMenu(){
        webDriver.findElement(completeWebFormMenu).click();
        return new WebFormPage(webDriver);
    }
}
