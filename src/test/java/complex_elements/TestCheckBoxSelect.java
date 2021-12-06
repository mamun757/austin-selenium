package complex_elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCheckBoxSelect {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.expedia.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void ExecuteTest(){
       driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//*[@id='add-flight-switch']")).click();
        driver.findElement(By.xpath("//*[@id='add-car-switch']")).click();
        driver.findElement(By.xpath("//button[text()='Search']")).click();

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
