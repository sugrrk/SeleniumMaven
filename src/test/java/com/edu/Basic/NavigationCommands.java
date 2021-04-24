package com.edu.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        // tell the location of driver


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");

        // create object of chrome driver class

         driver = new ChromeDriver();

        // open the url in browser
        driver.get("http://whiteboxqa.com/index.php");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.walmart.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.close();

    }
}
