package com.edu.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckBoxDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        Select select = new Select(driver.findElement(By.id("cars")));
        System.out.println("The dropdown options are ");
        List<WebElement> options = select.getOptions();
        for(WebElement ele : options){
            System.out.println(ele.getText());

        }
    }
}
