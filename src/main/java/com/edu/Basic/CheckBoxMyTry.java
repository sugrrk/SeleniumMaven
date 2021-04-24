package com.edu.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxMyTry {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        //Id and name
//        WebElement searchbox = driver.findElement(By.id("search_query_top"));// we can store it in a variable.
//        searchbox.sendKeys("T-shirts");
//        driver.findElement(By.name("submit_search")).click();
         //ClassName
      int sliders = driver.findElements(By.className("homeslider-container")).size();
        System.out.println(sliders);

        int links = driver.findElements(By.tagName("a")).size();
        System.out.println(links);

    }
}
