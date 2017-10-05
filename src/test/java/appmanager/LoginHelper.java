package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 * Created by mmalanyuk on 7/5/2017.
 */
public class LoginHelper extends HelperBase {


    public LoginHelper(WebDriver wd) {

        super(wd);
    }


    public void login(String username, String password) {
        type(By.name("Email"), username);
        type(By.name("Password"), password);
        click(By.xpath("//input[@class='btn auth-button' and @value='Login']"));
    }
    public void logout(){
        click(By.xpath("//a[@href='#/logout']"));
    }



    protected boolean areElementPresents(WebElement element, By locator) {
        return element.findElements(locator).size() > 0;
    }
}
