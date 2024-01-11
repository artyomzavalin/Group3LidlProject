package Login_Functionality;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Register_Test extends DriverClass {

    WebElement birtday=driver.findElement(By.xpath("//input[@id='date-picker-dialog']"));
        birtday.sendKeys("11111111");

        MyMethods.myWait(2);

    WebElement birtdayMistake=driver.findElement(By.xpath("//*[text()='Age must be less than 100.']"));

        Assert.assertTrue(birtdayMistake.getText().contains("Age must be less than 100."));

        for (int i = 0; i <4; i++) {
        Action action = actions.sendKeys(Keys.BACK_SPACE).build();

        action.perform();
    }
        MyMethods.myWait(2);

        birtday.sendKeys("2222");
        MyMethods.myWait(2);

    WebElement birtdayMistake1=driver.findElement(By.xpath("//*[text()='You must be at least 13 years old.']"));
        Assert.assertTrue(birtdayMistake1.getText().contains("You must be at least 13 years old."));

        MyMethods.myWait(2);

        for (int i = 0; i <3; i++) {
        Action action = actions.sendKeys(Keys.BACK_SPACE).build();

        action.perform();
    }

        MyMethods.myWait(2);

        birtday.sendKeys("000");

        MyMethods.myWait(2);

}
