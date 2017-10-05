package tests;

import appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;

/**
 * Created by mmalanyuk on 7/5/2017.
 */
public class TestBase {
    protected static final ApplicationManager app
            = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));
}
