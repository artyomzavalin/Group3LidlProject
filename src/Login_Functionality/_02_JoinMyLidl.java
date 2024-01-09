package Login_Functionality;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_JoinMyLidl extends DriverClass {
    public static Object clickandRedirect(){
        driver.get("https://www.lidl.com/login");
        MyMethods.myWait(2);


        WebElement singleClickButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/form/div/div[3]/a"));

        Actions actions = new Actions(driver);
        actions.click(singleClickButton).build().perform();

        // waitandQuit();

        return null;
    }

}
