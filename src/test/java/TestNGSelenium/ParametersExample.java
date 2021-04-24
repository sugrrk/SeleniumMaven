package TestNGSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser,String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(app);

        }
    }

    @Test(priority = 1)
    void logotest(){
        WebElement logo = driver.findElement(By.id("logo"));
        Assert.assertTrue(logo.isDisplayed());
    }


    @Test(priority=2)
    void homepageTitle(){
        String title =  driver.getTitle();
        Assert.assertEquals("QA/QE/SDET Training.",title);
    }

    @AfterClass
    void tearDown(){

        driver.quit();
    }
}

