package appmanager;

import org.openqa.selenium.WebDriver;

/**
 * Created by mmalanyuk on 7/5/2017.
 */
public class NavigateHelper extends HelperBase {
    public NavigateHelper(WebDriver wd){
        super(wd);
    }

    public void goToTemplatePageUsingUrl(){
        getUrl("https://dev.b2winform.com/B2W.Platform.Web.Integration/#/inform/templates");
    }
}
