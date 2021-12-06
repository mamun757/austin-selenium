package practice;

public class LearnLoop {

    public void WhileLoop(){
        int i =1;
        while (i<=10){
            System.out.println("the value of While Loop is: " + i);
            i+=1;
        }
    }

    public void ForLoop(){
        for (int i =0; i<=20; i+=5){
            System.out.println("The value of For Loop is: "+ i);
        }
    }

    public void DoWhileLoop(){
        int i =0;
        do {
            System.out.println("The value of Do While Loop is: " + i);
            i+=5;
        }while (i <= 40);
    }
}
