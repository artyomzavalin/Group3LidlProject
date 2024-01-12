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

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(banner));

    WebElement acceptCookies = driver.findElement(By.cssSelector("div[id=\"onetrust-close-btn-container\"]"));
        acceptCookies.click();

    String expectedURL = "https://www.lidl.com/";

        Assert.assertTrue(driver.getCurrentUrl().equals(expectedURL));

    JavascriptExecutor js = (JavascriptExecutor) driver;


    WebElement joinMyLidl = driver.findElement(By.cssSelector("a[data-test=\"register\"]"));


        js.executeScript("arguments[0].scrollIntoView(true);", joinMyLidl);

        joinMyLidl.click();

    WebElement firstName = driver.findElement(By.cssSelector("input[id=\"input0\"]"));
        firstName.sendKeys("Leeno");


    WebElement lastName = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));
        lastName.sendKeys("Adam");


    WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        email.sendKeys("leeno2020@gmail.com");


    WebElement confirmEmail = driver.findElement(By.cssSelector("input[name=\"confirm_email\"]"));
        confirmEmail.sendKeys("leeno2020@gmail.com");

}
}

