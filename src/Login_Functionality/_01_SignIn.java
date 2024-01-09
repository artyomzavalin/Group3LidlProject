package Login_Functionality;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_SignIn extends DriverClass {
    @Test
    public void singleClickActionTest() {
        driver.get("https://www.lidl.com/");
        MyMethods.myWait(2);

        WebElement singleClickButton = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/nav[2]/ul/li[3]/a "));



        Actions actions = new Actions(driver);


        actions.click(singleClickButton).build().perform();

        waitAndQuit();

    }
}


