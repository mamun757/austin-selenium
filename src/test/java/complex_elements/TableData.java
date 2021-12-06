package complex_elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TableData {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();
    }

    @Test
    public void ExecuteTest(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Rates']"))).perform();

        driver.findElement(By.xpath("//a[text()='Real APR']")).click();

        int rowNumber = driver.findElements(By.xpath("//th[1][text()='Loan Structure']/ ../../ ../thead/tr/th")).size();
        System.out.println("Total Row of the table is: " + rowNumber);

        int colNumber = driver.findElements(By.xpath("//td[1][text()=' Home Price: ']/ ../ ../tr")).size();
        System.out.println("Total Column of the table is: " + colNumber);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
