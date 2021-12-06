package complex_elements;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PrintLink {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void ExecuteTest(){
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for (WebElement lists:elements){
            System.out.println("The Lists are: " + lists.getAttribute("href"));
        }
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
