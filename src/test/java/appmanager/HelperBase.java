package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by mmalanyuk on 7/5/2017.
 */
public class HelperBase {
    public WebDriver wd;
    protected WebDriverWait wait;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
        this.wait = new WebDriverWait(wd, 10);
    }
    public void click(By locator) {

        wd.findElement(locator).click();
    }

    public void click(WebElement element) {
        element.click();
    }


    public List<WebElement> listOfElements(By locator) {
        return wd.findElements(locator);
    }
    public WebElement element(By locator) {
        return wd.findElement(locator);
    }
    public List<WebElement> listOfElements(By locator, WebElement element) {
        return element.findElements(locator);
    }

    public void back() {
        wd.navigate().back();
    }
    public void type(By locator, String text) {
        click(locator);
        if (text != null) {
            WebElement element = wd.findElement(locator);
            String existingText = element.getAttribute("value");
            if (!text.equals(existingText)) {
                element.clear();
                element.sendKeys(text);
            }
        }
    }

    public String getText(By locator){
        return wd.findElement(locator).getText();
    }
    public void getUrl(String url){

        wd.get(url);
    }
}
