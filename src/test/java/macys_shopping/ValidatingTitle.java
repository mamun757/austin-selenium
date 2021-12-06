package macys_shopping;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatingTitle {

    WebDriver driver;

    @BeforeMethod
    public void browserInitialization(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        ActOn.browser(driver).openBrowser("https://www.macys.com/");
    }

    @Test
    public void verifyHomePage(){
        String expectedTitle = "Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com";
        String actualTitle =ActOn.browser(driver).captureTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterMethod
    public void closeBrowser(){
        ActOn.browser(driver).closeBrowser();
    }
}
