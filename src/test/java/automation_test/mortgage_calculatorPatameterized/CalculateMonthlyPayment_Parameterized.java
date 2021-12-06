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
import utilities.DateUtils;
import utilities.ReadConfigFiles;
import utilities.SqlConnector;

import java.sql.ResultSet;


public class CalculateMonthlyPayment_Parameterized {
    private static final Logger LOGGER = LogManager.getLogger(CalculateMonthlyPayment_Parameterized.class);
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("........TestName: Calculate Monthly Payment starts........");
        String browserUrl = ReadConfigFiles.getPropertyValues("url");
       ActOn.browser(driver).openBrowser(browserUrl);
    }

    @Test
    public void CalculatePayment() {
        String date = DateUtils.returnNextMonth();
        String [] dates = date.split("-");
        String month = dates[0];
        String year = dates[1];

        try {
            ResultSet rs = SqlConnector.readData("select * from monthly_mortgage");
            while (rs.next()){
                new NavigationBar(driver).navigateToHome()
                        .TypeHomeValue(rs.getString("homevalue"))
                        .TypeDownPayment(rs.getString("downpayment"))
                        .ClickOnDollar()
                        .TypeLoanAmount(rs.getString("loanamount"))
                        .TypeInterestRate(rs.getString("interestrate"))
                        .TypeLoanTerm(rs.getString("loanterm"))
                        .SelectMonth(month)
                        .TypeYear(year)
                        .TypePropertyTax(rs.getString("propertytax"))
                        .TypePMI(rs.getString("pmi"))
                        .TypeHOI(rs.getString("homeownerinsurance"))
                        .TypeHOAInsurance(rs.getString("monthlyhoa"))
                        .SelectLoanType(rs.getString("loantype"))
                        .SelectBuyOrRefinance(rs.getString("buyorrefi"))
                        .ClickOnCalculateButton()
                        .ValidatingMonthlyPayment(rs.getString("totalmonthlypayment"));
            }
        }catch (Exception e){
            LOGGER.error("Exception is: " + e.getMessage());
        }
    }



    @AfterMethod
    public void closeBrowser() {
        ActOn.browser(driver).closeBrowser();
        LOGGER.info("............End of Calculate Monthly Payment test........");
    }
}
