package com.edu.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserCommands {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");

        // create object of chrome driver class

        driver = new ChromeDriver();

        // open the url in browser
        driver.get("http://whiteboxqa.com/index.php");
    }
        @Test
        public void verifyPageTitle() {
        String title = driver.getTitle();
            Assert.assertEquals(title, "QA/QE/SDET Training.");

        }
        @Test
    public void verifyCurrentUrl(){
    String Url = driver.getCurrentUrl();
    Assert.assertEquals(Url,"http://whiteboxqa.com/index.php");

    }

    @AfterMethod
    public void teardown(){

        driver.close();
    }
}
