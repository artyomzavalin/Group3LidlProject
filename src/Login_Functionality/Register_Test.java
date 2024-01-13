//package Login_Functionality;
//
//import Utilities.DriverClass;
//import Utilities.MyMethods;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//public class Register_Test extends DriverClass {
//    @Test
//    public void singleClickActionTest() {
//        driver.get("https://www.lidl.com/");
//        MyMethods.myWait(2);
//
//        WebElement singleClickButton = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/nav[2]/ul/li[3]/a "));
//
//
//        Actions actions = new Actions(driver);
//
//
//        actions.click(singleClickButton).build().perform();
//
//    }
//    @Test
//        public static Object clickandRedirect(){
//            driver.get("https://www.lidl.com/login");
//            MyMethods.myWait(2);
//
//
//            WebElement singleClickButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/form/div/div[3]/a"));
//
//            Actions actions = new Actions(driver);
//            actions.click(singleClickButton).build().perform();
//
//            // waitandQuit();
//
//            return null;
//        }
//    @Test
//    public void verifyThePage() {
//
//        _02_JoinMyLidl page = new _02_JoinMyLidl();
//        page.clickandRedirect();
//        if (("https://www.lidl.com/register").equals(page.clickandRedirect())) ;
//        System.out.println("The link is correct");
//    }
//
//
//
//
//
//
//
//
//}
