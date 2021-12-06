package practice;

import java.util.Scanner;

public class JavaScanner {
    public void GetDataFromUser(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String s = in.nextLine();
        System.out.println("Your Entered Name is:  " + s);

        System.out.print("Enter your age : ");
        int a = in.nextInt();
        System.out.println("Your age is: " + a);
    }
}
