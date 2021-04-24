package com.edu.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.apple.com/");
        driver.navigate().to("https://www.apple.com");
        driver.manage().window().maximize();
        //Clicking mac button
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']")).click();// explain during xpath.
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        driver.navigate().refresh();
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("url : " + CurrentUrl );
        driver.close();
       // driver.quit();
//Assertions.



    }
}
