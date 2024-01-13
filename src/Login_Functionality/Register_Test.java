package Login_Functionality;

import Utilities.DriverClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register_Test extends DriverClass {

    @Test
  public void registerTest(){

        driver.get("https://www.lidl.com/");

        WebElement closeGreenTab = driver.findElement(By.cssSelector("img[alt=\"close-white description\"]"));
        closeGreenTab.click();

        WebElement banner = driver.findElement(By.cssSelector("div[id=\"onetrust-banner-sdk\"]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(banner));

        WebElement acceptCookies = driver.findElement(By.cssSelector("div[id=\"onetrust-close-btn-container\"]"));
        acceptCookies.click();

        WebElement signIn = driver.findElement(By.linkText("sign in"));
        signIn.click();

        WebElement joinMyLidl = driver.findElement(By.cssSelector("a[data-test=\"joinButton\"]"));
        joinMyLidl.click();


        String expectedURL = "https://www.lidl.com/register";
        Assert.assertTrue(driver.getCurrentUrl().equals(expectedURL));


        WebElement firstName = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
        firstName.sendKeys("Leeno");


        WebElement lastName = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));
        lastName.sendKeys("Adam");


        WebElement emailInput = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailInput.sendKeys("leeno2020@gmail.com");

        WebElement errorMessage = driver.findElement(By.cssSelector("span[class=\"email-taken-inline-error\"]"));

        if (errorMessage.getText().contains("This email is already registered. Want to sign in or recover your password?")) {
            System.out.println("Test Passed: Correct error message displayed.");

        } else {
            System.out.println("Test Failed: Incorrect error message displayed.");
        }

    }

}