package Login_Functionality;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ProducPreferences_Test extends DriverClass {
    @Test
    public void preferences(){


        driver.get("https://www.lidl.com");

        MyMethods.myWait(1);

        WebElement acceptCookies = driver.findElement(By.cssSelector("div[id=\"onetrust-close-btn-container\"]"));
        acceptCookies.click();

        MyMethods.myWait(1);

        WebElement button = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/nav[2]/ul/li[3]/a"));
        button.click();



        WebElement email = driver.findElement(By.xpath("//*[@id=\"input0\"]"));
        email.sendKeys("shaymaa.translator@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"input1\"]"));
        password.sendKeys("Shimo@2020");

        WebElement clicksignIn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/form/div/button[5]"));
        clicksignIn.click();

        WebElement myaccount = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/nav[2]/ul/li[3]/span/button/img"));

        myaccount.click();

        WebElement myname = driver.findElement(By.xpath("/html/body/div[5]/div[3]/ul/a[1]/article/div[2]/div"));

        myname.click();




        WebElement preferences = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div[2]/ul/li[2]/a"));

        preferences.click();

        MyMethods.myWait(2);

        WebElement singleClickButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/span/span[1]/span/input"));

        Actions actions = new Actions(driver);

        Action action = actions.click(singleClickButton).build();
        action.perform();




       // WebElement kosher = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/span/span[1]/span/input"));

       // kosher.click();
        MyMethods.myWait(2);

        WebElement vegan = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[5]/div/span/span[1]/span/input"));

        vegan.click();
        MyMethods.myWait(2);

        WebElement yeast = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div[2]/div/div/div/form/div[2]/div[2]/div/span/span[1]/span/input"));

        yeast.click();

        MyMethods.myWait(5);


        WebElement save = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div[2]/div/div/div/form/div[5]"));

        save.click();



    }
}

