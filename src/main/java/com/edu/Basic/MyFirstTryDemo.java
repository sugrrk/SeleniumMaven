package com.edu.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyFirstTryDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        WebElement  searchbox = driver.findElement(By.id("search"));
        searchbox.sendKeys("Toys");

    }

}
