package com.edu.Basic;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class AppTest {

    public static void main(String[] args) {
        WebDriver driver;
        // tell the location of driver


          System.setProperty("webdriver.chrome.driver","C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\Resources1\\chromedriver.exe");

           // create object of chrome driver class

         driver = new ChromeDriver();

        // open the url in browser
        driver.get("http://whiteboxqa.com/index.php");

        System.out.println("Title " + driver.getTitle());
        System.out.println("Url" + driver.getCurrentUrl());
        String source = driver.getPageSource();
        System.out.println("source " + source );
        driver.close();

    }
}