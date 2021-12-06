package practice;

public class ConditionalStatements {

    public void Switch(char grade){
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                break;
            case 'C':
                System.out.println("Well done ");
                break;
            case 'D':
                System.out.println("You Passed");
                break;
            case 'F':
                System.out.println("You did Fail");
                break;
            default:
                System.out.println("Invalid grade ");
        }
        System.out.println("Your grade is " + grade);
    }

    public void PrintGrades(char grade){
        if (grade == 'A'){
            System.out.println("Excellent");
        }else if (grade == 'B' || grade == 'C'){
            System.out.println("Well done ");
        }else if (grade == 'D'){
            System.out.println("You Passed");
        }else if (grade == 'F'){
            System.out.println("You did Fail");
        }else {
            System.out.println("Invalid grade ");
        }
        System.out.println("Your grade is " + grade);
    }

    public void TernaryOperator(){
        int a, b;
        a = 10;
        b= (a ==1) ? 20: 30;
        System.out.println(" B is: " + b);
    }
}
