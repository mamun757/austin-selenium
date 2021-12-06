package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public void ArrayToList(){
        //Creating Array
        String[] states = {"California", "Alaska", "Florida", "Connecticut", "Pennsylvania"};
       System.out.println("Array is: " + Arrays.toString(states));

       //Converting Array To List
        List<String> lists = new ArrayList<>();
        for ( String lang:states){
           lists.add(lang);
        }
        System.out.println("Printing List is: " + lists);
    }

    public void ListToArray(){
        //Creating List
        List<String> FruitList= new ArrayList<>();
        FruitList.add("Mango");
        FruitList.add("Banana");
        FruitList.add("Guava");

        for ( String fruit: FruitList){
            System.out.println("Printing Fruit is: " + fruit);
        }

        //Converting ArrayList To array
        String [] array = FruitList.toArray(new  String[FruitList.size()]);
        System.out.println("Printing array is: " + Arrays.toString(array));
        System.out.println("Printing List is: " + FruitList);
    }
}
