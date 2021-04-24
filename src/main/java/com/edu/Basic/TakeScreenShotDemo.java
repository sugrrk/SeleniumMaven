package com.edu.Basic;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotDemo {
    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");//We can use any website.

        String fileName = "Demo";
        //Take screenshot and store it in a file format

        //Take screenshot is a interface so we cannot create object so we are casting to driver.
        //and we will call a method.
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // copy the screenshot to desired location. by creating a folder and using copy file method.
        FileHandler.copy(file, new File("C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\screenshots" + fileName + ".png"));


    }

}
