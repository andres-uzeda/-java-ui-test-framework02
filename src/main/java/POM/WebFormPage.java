package POM;

import Utils.Util;
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
    private By submitButton = By.cssSelector(".btn-lg");
    private By submittingDivMessage = By.cssSelector(".alert-success");

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
        webDriver.findElement(submitButton).click();
        return new WebFormPage(webDriver);
    }
    public String VerifyThatAFormWasSent(){
        Util.WaitElement(submittingDivMessage, this.webDriver);
        return webDriver.findElement(submittingDivMessage).getText();
    }
}
