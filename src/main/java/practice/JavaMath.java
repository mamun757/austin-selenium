package practice;

import java.util.Random;

public class JavaMath {
    public void Randomize(){
        Random random = new Random();
        //Generate random number 0-999
        int num1 = random.nextInt(1000);
        int num2 = random.nextInt(1000);

        System.out.println(" First number is: " + num1);
        System.out.println("Second number is: " + num2);

        double num3 = random.nextDouble();
        double num4 = random.nextDouble();
        System.out.println(" First Double number is: " + num3);
        System.out.println("Second Double number is: " + num4);
    }

    public void MathRound(){
        Double num1 = 45.89;
        System.out.println(Math.round(num1));
    }
    public void MathMax(){
        Double num1 = 45.89;
        Double num2 = 34.12;
        System.out.println(Math.max(num1, num2));
    }

    public void MathMin(){
        Double num1 = 45.89;
        Double num2 = 34.12;
        System.out.println(Math.min(num1, num2));
    }
}
