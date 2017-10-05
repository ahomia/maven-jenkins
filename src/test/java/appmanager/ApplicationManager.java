package appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by mmalanyuk on 7/5/2017.
 */
public class ApplicationManager {
    private String browser;
    WebDriver wd;
    private LoginHelper loginHelper;
    private PageHelper pageHelper;


    private NavigateHelper navigateHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://dev.b2winform.com/B2W.Platform.Web.Integration");
        loginHelper = new LoginHelper(wd);
        pageHelper=new PageHelper(wd);
        navigateHelper=new NavigateHelper(wd);

    }
    public void stop(){
        wd.quit();
    }

    public LoginHelper login() {
        return loginHelper;
    }
    public PageHelper page(){
        return pageHelper;
    }
    public NavigateHelper navigateHelper() {
        return navigateHelper;
    }

}
