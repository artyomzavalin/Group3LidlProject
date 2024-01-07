package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverClass {
    public static WebDriver driver;

    static {

        driver = new ChromeDriver();

        driver.manage().window().maximize(); //to open the browser in full screen
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //.waits for 15 sec. for our computer downloads all the file from the web server
        //if they are not downloaded in 15 sec. it throws exception, that means there is
        // a problem with the server or internet connection.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //selenium waits for 15 sec. till all elements are loaded in HTML code
        //if they are not loaded in 15 sec. it throws an exception
        ////that means your website is not compatible with the browser you are using.
        //in testing if the requirements are that the website should be loaded in 5 sec. then 5 sec should be put instead of 15 sec.


    }

    public static void waitAndQuit() {
        MyMethods.myWait(3);
        driver.quit();
    }
}
