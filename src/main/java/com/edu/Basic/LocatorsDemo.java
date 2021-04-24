package com.edu.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    WebDriver driver;
    public void launchChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.walmart.com/");
       WebElement logo =  driver.findElement(By.id("hf-home-link"));
      logo.click();

      driver.close();
    }

    public static void main(String[] args) {
        LocatorsDemo lc = new LocatorsDemo();
        lc.launchChrome();

    }
}
