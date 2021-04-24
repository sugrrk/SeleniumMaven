package com.edu.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoqa.com/automation-practice-form");
        List<WebElement> radiobutton = driver.findElements(By.xpath("//div[@class =\"custom-control custom-radio custom-control-inline\"]"));
        radiobutton.get(1).click();
        radiobutton.get(0).click();
        radiobutton.get(2).click();
    }
}
//      boolean bvalue = false;
//        bvalue = radiobutton.get(0).isSelected();
//        if(bvalue == true){
//            radiobutton.get(1).click();
   //     }
//        else{
//            radiobutton.get(0).click();
//            radiobutton.get(2).click();
//        }







