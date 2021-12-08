package automation_test.mortgage_calculator;


import org.testng.annotations.Test;
import page_objects.NavigationBar;
import utilities.DateUtils;



public class CalculateMonthlyPayment extends BaseClassUITest {
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


}
