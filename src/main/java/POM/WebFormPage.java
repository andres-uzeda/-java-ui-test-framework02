package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebFormPage {
    protected WebDriver webDriver;

    private By nameInput = By.cssSelector("#first-name");
    private By lastNameInput = By.cssSelector("#last-name");

    public WebFormPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public WebFormPage FillUpForm(String name, String lastName){
        webDriver.findElement(nameInput).sendKeys(name);
        webDriver.findElement(lastNameInput).sendKeys(lastName);
        return new WebFormPage(webDriver);
    }
}
