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
import utilities.DateUtils;


public class CalculateMonthlyPayment {
    private static final Logger LOGGER = LogManager.getLogger(CalculateMonthlyPayment.class);
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
    }

    @Test
    public void CalculatePayment()  {
        String date = DateUtils.returnNextMonth();
        String [] dates = date.split("-");
        String month = dates[0];
        String year = dates[1];

        new NavigationBar(driver).navigateToHome()
                .TypeHomeValue("300000")
                .TypeDownPayment("60000")
                .ClickOnDollar()
                .TypeLoanAmount("240000")
                .TypeInterestRate("3")
                .TypeLoanTerm("30")
                .SelectMonth(month)
                .TypeYear(year)
                .TypePropertyTax("5000")
                .TypePMI("0.5")
                .TypeHOI("1000")
                .TypeHOAInsurance("100")
                .SelectLoanType("FHA")
                .SelectBuyOrRefinance("Buy")
                .ClickOnCalculateButton()
                .ValidatingMonthlyPayment("$1,611.85");

    }

    @AfterMethod
    public void closeBrowser() {
        ActOn.browser(driver).closeBrowser();
    }
}
