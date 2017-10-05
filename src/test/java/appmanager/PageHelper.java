package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by mmalanyuk on 7/5/2017.
 */
public class PageHelper extends HelperBase {

    public PageHelper(WebDriver wd) {
        super(wd);
    }

    public String getHeaderText(){
        return getText(By.cssSelector(".header"));

    }
}
