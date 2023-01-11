package loginClass;

import com.baseClass.Base;
import loginPage.Login;
import loginPage.homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login extends Base {


    @BeforeSuite
    public void Initialization(){
        setup();
    }

    @Test(priority = 0)
    public void loginTest() {
        Login l = PageFactory.initElements(driver, Login.class);
        l.loginClick();
    }
    @Test(priority = 1)
    public void DashboardTest() throws InterruptedException {
        homepage h=PageFactory.initElements(driver, homepage.class);
        h.dashboard();


    }

    @AfterSuite
    public void Teardown() {
       // teardown();

    }
}
