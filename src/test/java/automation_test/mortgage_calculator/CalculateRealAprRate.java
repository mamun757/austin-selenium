package automation_test.mortgage_calculator;

import org.testng.annotations.Test;
import page_objects.NavigationBar;


public class CalculateRealAprRate extends BaseClassUITest {
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

}
