package complex_elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ScreenShotHandling {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void ExecuteTest() throws IOException {
        TakesScreenshot tc = (TakesScreenshot)driver;
        File src = tc.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,new File("google.png"));
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
