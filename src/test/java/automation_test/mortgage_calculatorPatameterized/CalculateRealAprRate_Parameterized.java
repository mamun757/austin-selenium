package automation_test.mortgage_calculatorPatameterized;

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
import parameters.DataProviderClass;
import utilities.ReadConfigFiles;


public class CalculateRealAprRate_Parameterized {
    private static final Logger LOGGER = LogManager.getLogger(CalculateRealAprRate_Parameterized.class);

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        LOGGER.info("........TestName: Calculate Real Apr Rates starts........");
        String browserUrl = ReadConfigFiles.getPropertyValues("url");
        ActOn.browser(driver).openBrowser(browserUrl);
    }

    @Test(dataProvider = "RealAprRates", dataProviderClass = DataProviderClass.class)
    public void calculateRealApr(String homePrice, String downPayment, String interestRate, String actualApr){
        new NavigationBar(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .HomeValue(homePrice)
                .ClickOnDollarButton()
                .DownPayment(downPayment)
                .InterestRate(interestRate)
                .ClickOnCalculateButton()
                .validatingAprRate(actualApr);

    }

    @AfterMethod
    public void closeBrowser(){

        ActOn.browser(driver).closeBrowser();
        LOGGER.info("............End of Real Apr Rate  test........");
    }

}
