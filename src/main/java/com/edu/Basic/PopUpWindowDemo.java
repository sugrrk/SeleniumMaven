package com.edu.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class PopUpWindowDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//a[contains(@href,'popup.php')]")).click();
        //get window handle will give control to the current screen.
        String MainWindow = driver.getWindowHandle();//parent window
        //to avoid duplicate we use set method.
        //window handles will get access to all the windows opened
        Set<String> s1 = driver.getWindowHandles();// parent ,child window

        //We can use iterator to iterate over these multiple windows.and we will create a instance for that.

        Iterator<String> itr = s1.iterator();//when we call s1.iterator it returns the instance
        //it has has next method and we can iterate over it
        while(itr.hasNext()){
            String childwindow= itr.next();//now we have access to both the window

            if(!MainWindow.equalsIgnoreCase(childwindow)){//we have to switch now.
                driver.switchTo().window(childwindow);
                Thread.sleep(5000);
                driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
                driver.findElement(By.name("btnLogin")).submit();
                String message = driver.findElement(By.xpath("//h3[contains(text(),'valid only')]")).getText();
                System.out.println(message);
                driver.close();
            }
        }
        driver.switchTo().window(MainWindow);
        driver.close();
    }
}
