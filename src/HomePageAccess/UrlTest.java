package HomePageAccess;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import Utilities.DriverClass;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UrlTest extends DriverClass {

    @Test

    public void accessToHomepage() {

        driver.get("https://www.lidl.com/");


        WebElement closeGreenTab = driver.findElement(By.cssSelector("img[alt=\"close-white description\"]"));
        closeGreenTab.click();

        WebElement banner = driver.findElement(By.cssSelector("div[id=\"onetrust-banner-sdk\"]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(banner));

        WebElement acceptCookies = driver.findElement(By.cssSelector("div[id=\"onetrust-close-btn-container\"]"));
        acceptCookies.click();

        String expectedURL = "https://www.lidl.com/";

        Assert.assertTrue(driver.getCurrentUrl().equals(expectedURL));
    }
}

