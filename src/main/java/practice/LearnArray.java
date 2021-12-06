package practice;

import java.util.*;

public class LearnArray {
       public void OneDArray(){
           String[] states = {"California", "Alaska", "Florida", "Connecticut", "Pennsylvania"};
//

//           for (int i = 0; i < states.length; i+=1 ){
//               System.out.println("The Array is: " + states[i]);
//           }

//           for ( String state:states){
//               System.out.println("The Array is: " + state);
//           }

            // Print the States Name in Ascending Order
           Arrays.sort(states);
           System.out.println(Arrays.toString(states));

           //Print the States Name in Descending Order
           Arrays.sort(states, Collections.reverseOrder());
           System.out.println(Arrays.toString(states));
       }

       public void LearnArrayList() {
           List<String> lists = new ArrayList<>();
           lists.add("New York");
           lists.add("New Jersey");
           lists.add("Maryland");

//           for ( String list: lists){
//               System.out.println("Number is: " + list);
//           }
           for (int i = 0; i < lists.size(); i+=1){
               System.out.println("Number is: " + lists.get(i));
           }

           lists.remove(1);
           lists.add("Georgia");
           lists.add("Texas");

           System.out.println("-------"+ lists + "------");

       }

        String [] array;
        List<String> list;

       public void ConvertArrayToList(){
           //Creating Array
           array = new String[] {"Java", "Python", "C++", "PHP"};
           System.out.println("Printing Array: " + Arrays.toString(array));

           //Convert this Array To List
           list = new ArrayList<>();
           for (String language: array){
               list.add(language);
           }
            System.out.println("Printing list is: " + list);

           //Adding new value into the list
           list.add("Visual Basic");
           list.add("SQL");
           list.add("HTML");
           System.out.println("Printing upon adding the List: " + list);

           //Removing one value from the list
           list.remove("SQL");
           System.out.println("Printing the new list: " + list);

       }

       public void ConvertListToArray(){
           array = list.toArray(new String[list.size()]);
           System.out.println( "Printing Array: " +Arrays.toString(array));
       }

}
