package com.edu.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://whiteboxqa.com/index.php");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"QA/QE/SDET Training.");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url,"http://whiteboxqa.com/index.php");
        driver.close();
    }
}
