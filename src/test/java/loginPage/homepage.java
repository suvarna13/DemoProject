package loginPage;

import com.baseClass.Base;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

import java.awt.*;
import java.util.List;

public class homepage extends Base {

    @FindBy(xpath="//button[text()='OK']")
    WebElement ok_button;

    @FindBy(xpath="(//img[@class='MuiAvatar-img css-1hy9t21'])[1]")
    WebElement Image_icon;

    @FindBy(xpath = "//span[text()='Select a company']")
    WebElement getSelect_company;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement Name_company;

    @FindBy(xpath = "//div[@data-cy='site-selection-dropdown-button']")
    WebElement dev_name;


    public homepage(WebDriver driver){
        this.driver=driver;
    }

    public void dashboard() throws InterruptedException {


        Thread.sleep(40000);
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//html/body"))).click();
        a.sendKeys(Keys.ESCAPE).build().perform();
       //browser_notification();
        Thread.sleep(2000);
//        WebDriverWait w=new WebDriverWait(driver,80);
//        w.until(ExpectedConditions.elementToBeClickable(ok_button));
        ok_button.click();
        Thread.sleep(2000);

//Add chrome switch to disable notification - "**--disable-notification


        Thread.sleep(1000);
        Image_icon.click();
        Thread.sleep(1000);
        getSelect_company.click();
        Thread.sleep(1000);
        Name_company.sendKeys("Forsight Dev");
       // Thread.sleep(5000);
        WebDriverWait w=new WebDriverWait(driver,80);
       w.until(ExpectedConditions.elementToBeClickable(dev_name));
        dev_name.sendKeys("Dev");




    }
        }

