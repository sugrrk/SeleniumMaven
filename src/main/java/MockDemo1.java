import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suganya\\IdeaProjects\\httpclient\\untitled\\SeleniumMaven\\src\\main\\NewResources\\chromedriver.exe");
        //WebDriver driver =new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();//Its valid
        driver.get("http://whiteboxqa.com/");


    }
}


