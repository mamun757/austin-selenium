package playground;

import org.testng.annotations.Test;
import parameters.DataProviderClass;

public class ExecuteTests {
    @Test(dataProvider = "MultipleValues", dataProviderClass = DataProviderClass.class)
    public void run(String name, String state, int zipCode){
        System.out.println("[Multiple column value] name is: " + name);
        System.out.println("[Multiple column value] state is: " + state);
        System.out.println("[Multiple column value] Zipcode is: " + zipCode);
    }
}
