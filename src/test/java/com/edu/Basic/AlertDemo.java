package com.edu.Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertDemo {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        // create object of chrome driver class

        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
     @Test
     public void alertEx(){
        driver.findElement(By.name("cusid")).sendKeys("213456");
         driver.findElement(By.name("submit")).submit();
        Alert alt = driver.switchTo().alert();
        String message = alt.getText();
         System.out.println(message);
         alt.accept();

     }

    @AfterMethod
    public void teardown(){

        driver.close();
    }
}

