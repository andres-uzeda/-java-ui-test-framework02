package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebFormPage {
    protected WebDriver webDriver;

    private By nameInput = By.cssSelector("#first-name");
    private By lastNameInput = By.cssSelector("#last-name");
    private By jobTittleInput = By.cssSelector("#job-title");
    private By educationLevelRadioButton = By.cssSelector("#radio-button-2");
    private By sexCheckBox = By.cssSelector("#checkbox-1");
    private By yearInput = By.cssSelector("#datepicker");

    public WebFormPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public WebFormPage FillUpForm(String name, String lastName){
        webDriver.findElement(nameInput).sendKeys(name);
        webDriver.findElement(lastNameInput).sendKeys(lastName);
        webDriver.findElement(jobTittleInput).sendKeys("Master");
        webDriver.findElement(educationLevelRadioButton).click();
        webDriver.findElement(sexCheckBox).click();
        webDriver.findElement(yearInput).sendKeys("10/10/1990");
        return new WebFormPage(webDriver);
    }
}
