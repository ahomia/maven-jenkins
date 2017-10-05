package tests.page.layout;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import tests.TestBase;

/**
 * Created by mmalanyuk on 7/5/2017.
 */
public class TemplateTest extends TestBase {
    @Before
    public void init()  {
        app.init();
        app.login().login("sysadmin@b2wsoftware.com","0Pen$Esame!");
        app.navigateHelper().goToTemplatePageUsingUrl();
    }

    @Test
    public void sortingOptionsTest(){
       // WebDriver sotriongOptionsList=
    }
    @After
    public void stop(){
        app.stop();
    }
}
