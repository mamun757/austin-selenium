package practice;

public class LearnVariables {
    public void intVariables(){
        int salary = 10000;
        System.out.println("My salary is: " + salary);
    }

    public void StringVariables(){
       String state = "New York";
       String city = "Jamaica";
        System.out.println("I live in : " + city + " And the state is :" + state);
    }

    public void CharVariables(){
       char alphabet= 'A';
        System.out.println(" character is: " + alphabet);
    }

    public void FloatVariables(){
       float price = 45.5f;
        System.out.println(" Product price is: " + price);
    }

    public void BooleanVariables(){
       boolean red = true;
       boolean green = false;
        System.out.println("Red light is: " + red + " And Green light is: " + green);
    }

    public int addNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
}
