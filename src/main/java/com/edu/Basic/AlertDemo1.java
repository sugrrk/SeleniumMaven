package com.edu.Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        //Locator called name.
        driver.findElement(By.name("cusid")).sendKeys("213456");
        driver.findElement(By.name("submit")).submit();
        //Now the control will be in main page
        // to switch from main window to pop window we use switch to method.
        Alert alt = driver.switchTo().alert();
//After getting control to pop up we can get a message.
        //What ever message we get it from pop up

        String message = alt.getText();
        System.out.println(message);
        //We click cancel button or to click ok we use alt.accept
        alt.dismiss();
    }
}
