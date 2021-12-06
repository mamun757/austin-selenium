package practice;

public class LearnRecursion {
    public void CountHi( int n){
        if(n == 0){
            System.out.println("Done");
        }else {
            System.out.println(n);
            n--;
            CountHi(n);
        }
    }

    public static int factorial(int num){
        if( num == 0 || num ==1){
            return 1;
        }else {
           return num * factorial(num-1);
        }
    }

    public static int Fibonacci( int num ){
        if (num == 0){
            return 0;
        }if (num==1){
            return 1;
        }else {
            return num ;
        }
    }

    //print 1-10 without using Loop
    public void printNumbers( int num){
        if (num <=10){
            System.out.println(num);
            printNumbers(num+=1);
        }
    }
    //print sum 10+ 9+ 8+7........

    public int Sum( int k){
        if (k > 0){
            return k + Sum(k-1);
        }else {
            return 0;
        }
    }
}
