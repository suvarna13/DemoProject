package loginPage;

import com.baseClass.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Base {



    @FindBy(name="email")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    WebElement submit;

    public Login(WebDriver driver){
        this.driver=driver;
    }

    public void loginClick(){
        username.sendKeys("vaibhav.khachane@neosoftmail.com");
        password.sendKeys("Forsightai@12345");
        submit.click();
    }
}
