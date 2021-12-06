package practice;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public void IndexOff(){
        String str = "I live in USA, I want to Live in Florida";
        System.out.println(str.indexOf('F'));//Searching a character
        System.out.println(str.indexOf("want", 2));//string
        System.out.println(str.indexOf("to"));
        System.out.println(str.indexOf("Live", 10));
        String str2 = "               ";
        System.out.println( "Printing empty space is: " +str2.length());
    }

    public void Concatenation(){
        String str1 = "mofij";
        String str2 = "Joshim";
        String labu = str1 + str2;
        System.out.println(labu);
    }

    public void SubString(){
        String str = "Florida Beautiful";
        System.out.println("Printing the string is: " + str.substring(8));
        System.out.println("Printing the string is: " + str.substring(0, 7));
        System.out.println("-----------");
        //Print Florida
        //length of Florida is 7
        String searchWord = "Florida";
        int wordPosition = str.indexOf("Florida");
        String subFlorida = str.substring(wordPosition, searchWord.length());
        System.out.println("Search for Florida is: " + subFlorida);
    }

    public void Length(){
        String str = "Florida Beautiful and Florida Beautiful and Florida Beautiful";
        System.out.println("The length of the String is: " + str.length());
    }

    public  void Replace(){
        String str = "Florida Hello Florida";
        System.out.println(str.replaceAll("Florida", "Georgia"));
        System.out.println(str.replaceFirst("Hello", "Florida"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    public void Trim(){
        String str = "          Florida             ";
        System.out.println("Print value is: " + str);
        System.out.println("Print the Trim:" +str.trim());
    }

    public void CharAt(){
        //print Hello in Reverse order
        // Output = olleH
        String str = "Hello";
        String reverseWord = "";
       for (int i= str.length()-1; i >=0; i-=1){
          char result = str.charAt(i);
          reverseWord +=String.valueOf(result);
       }
       System.out.println("The reverse word: " +reverseWord);

    }
    public void ReverseString(){
        String str = "I live in USA";
        String [] words = str.split(" ");

        for (String word: words){
            System.out.println(word);
        }
        //now reverse way
        String reverse = " ";
        for (int i = words.length-1; i >=0; i--){
            reverse += words[i] + " ";
        }
        System.out.println(reverse);
    }

    public void LearnFormat(){
        String name = "Jonathan";
        int age = 28;
        int salary = 40000;
        System.out.println("My name is " + name + ". I am " + age + " years old. and " + "my salary is $" + salary + " yearly.");

        String s = String.format("My name is %s I am %d years old. and my salary is $%d yearly.", name, age, salary);
        System.out.println(s);
    }

    public void Contains(){
        String st = "Joshim";
        System.out.println(st.contains("Jo"));
        System.out.println(st.contains("im"));
        System.out.println(st.contains("mo"));
    }

    public void LearnSplit(){
        String  names = "josjim, Babu, mofiz, korim";
        String [] nameArray = names.split(",");
        System.out.println(Arrays.toString(nameArray));

        for (String name: nameArray){
            System.out.println(name);
        }
    }
}
