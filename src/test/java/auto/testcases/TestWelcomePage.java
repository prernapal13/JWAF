package auto.testcases;
/**
 * Created by: Anuj Kumar
 * Email: cdac.anuj@gmail.com
 * Date: 12-May-18
 */

import auto.pages.WelcomePage;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestWelcomePage extends Init {

    @Test
    public void testWelcomePage() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
    }
}
