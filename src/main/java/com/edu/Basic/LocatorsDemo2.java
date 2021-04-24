package com.edu.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();
        //Tag &ID
        driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
        //driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");

        //Tag&class
        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com");

        //Tag &attribute

        driver.findElement(By.cssSelector("input[data-testid=royal_email]")).sendKeys("abc@gmail.com");

    }
}





