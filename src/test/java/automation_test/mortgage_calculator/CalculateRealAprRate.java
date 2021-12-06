package automation_test.mortgage_calculator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.NavigationBar;


public class CalculateRealAprRate {
    private static final Logger LOGGER = LogManager.getLogger(CalculateRealAprRate.class);

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
    }

    @Test
    public void calculateRealApr(){
        new NavigationBar(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .HomeValue("200000")
                .ClickOnDollarButton()
                .DownPayment("15000")
                .InterestRate("3")
                .ClickOnCalculateButton()
                .validatingAprRate("3.130%");

    }

    @AfterMethod
    public void closeBrowser(){
      ActOn.browser(driver).closeBrowser();
    }

}
