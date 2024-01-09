package Login_Functionality;

import Utilities.DriverClass;
import org.junit.Test;

public class _03_RegistrationPage extends DriverClass {
    @Test
    public void verifyThePage() {

        _02_JoinMyLidl page = new _02_JoinMyLidl();
        page.clickandRedirect();
        if (("https://www.lidl.com/register").equals(page.clickandRedirect())) ;
        System.out.println("The link is correct");
    }
    }
