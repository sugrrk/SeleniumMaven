package com.edu.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasicCommands {
  WebDriver driver;
    public void launchChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("http://whiteboxqa.com/");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("http://whiteboxqa.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[3]/a")).click();
        driver.navigate().back();
        driver.navigate().forward();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[5]/div[1]/h4/a"))).click();
        //Wait<WebDriver> fluentWait= new FluentWait<WebDriver>(driver)
                //.pollingEvery(5,TimeUnit.SECONDS);
        //fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).pollingEvery(5,TimeUnit.SECONDS);
        fluentwait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();

        driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[5]/a")).click();

        driver.navigate().refresh();
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("url : " + CurrentUrl );
//        String PageSource = driver.getPageSource();
//        System.out.println("source : " + PageSource);

        //Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
        public static void main(String[] args) throws InterruptedException {
            BasicCommands bc = new BasicCommands();
            bc.launchChrome();


    }
}
