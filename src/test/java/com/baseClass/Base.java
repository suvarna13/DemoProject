package com.baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Base {

    public WebDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\demoFramework\\Driver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dashboard-dev.forsight.ai/login");
    }
    
    public void browser_notification(){
//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--disable-notifications");
        Map<String, Object> prefs = new HashMap<String, Object>();

//Put this into prefs map to switch off browser notification
        prefs.put("profile.default_content_setting_values.notifications", 2);

//Create chrome options to set this prefs
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
        WebDriver driver = new ChromeDriver(options);
    }
    public void teardown() {
        driver.close();
    }

}
