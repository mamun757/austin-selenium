package parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @DataProvider(name = "SingleValue")
    public Object[][] storeSingleValue(){
        return new Object[][] {
                {"Rifat"},
                {"Mohammad"},
                {"Ashraf"}
        };
    }

    @DataProvider(name = "MultipleValues")
    public Object[][] storeMultipleValues() {
        return new Object[][] {
                {"Rifat", "Florida", 11432},
                {"Farid", "New York", 11788},
                {"Sojib", "Connecticut", 11988}
        };
    }

    @DataProvider(name = "RealAprRates")
    public Object[][] storeRealAprData(){
        return new Object[][] {
                {"200000", "15000", "3" , "3.130%"}
        };
    }

    @Test(dataProvider = "SingleValue")
    public void readSingleValue(String name){
        System.out.println("[Single column value] name is: " + name);
    }

    @Test(dataProvider = "MultipleValues")
    public void readMultipleValues(String name, String state, int zipCode){
        System.out.println("[Multiple column value] name is: " + name);
        System.out.println("[Multiple column value] state is: " + state);
        System.out.println("[Multiple column value] Zipcode is: " + zipCode);
    }

}
