package Login_Functionality;

import Utilities.DriverClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_Test extends DriverClass {

    @Test
    public void LogInTest() {

        driver.get("https://www.lidl.com/");

        WebElement logIn  = driver.findElement(By.cssSelector("a[href=\"/login\"]"));
        logIn.click();

       WebElement email = driver.findElement(By.cssSelector("input[type=\"email\"]"));
       email.sendKeys("shaymaa.translator@gmail.com");

        WebElement banner = driver.findElement(By.cssSelector("div[id=\"onetrust-banner-sdk\"]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(banner));

        WebElement acceptCookies = driver.findElement(By.cssSelector("div[id=\"onetrust-close-btn-container\"]"));
        acceptCookies.click();

       WebElement password = driver.findElement(By.cssSelector("input[name=\"password\"]"));
       password.sendKeys("Shimo@2020");


       WebElement signIn = driver.findElement(By.cssSelector("button[data-test=\"signInButton\""));
       signIn.click();




    }
}