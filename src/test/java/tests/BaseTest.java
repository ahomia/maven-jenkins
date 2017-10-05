package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mmalanyuk on 7/5/2017.
 */
public class BaseTest extends TestBase{
    @Before
    public void init()  {
        app.init();
    }

    @Test
    public void loginTest(){
        app.login().login("sysadmin@b2wsoftware.com","0Pen$Esame!");
        Assert.assertEquals("WELCOME TO B2W INFORM",app.page().getHeaderText());
    }
    @Test

    public void logoutTest(){
        if()
            app.login().login("sysadmin@b2wsoftware.com","0Pen$Esame!");
        app.login().logout();
    }

    @After
    public void stop(){
        app.stop();
    }
}
