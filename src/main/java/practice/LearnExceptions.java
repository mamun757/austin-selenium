package practice;

public class LearnExceptions {
    public void AddNumbers(){

        try {
            int [] num = {1,2,3,4};
            int result = num[0] + num[4];
            System.out.println(result);
        }catch (Exception e){
            System.out.println( "Adding Number: "+e.getMessage());
        }

    }

    public void SubNumbers(){
        try {
            int [] num = {1,2,3,4};
            int result = num[3] - num[0];
            System.out.println("Subtraction Number: " + result);
        }catch (Exception e){
            System.out.println("Subtraction Number: " + e.getMessage());
        }
    }

    public void MultiNumbers(){
        try {
            int [] num = {1,2,3,4};
            int result = num[0] * num[4];
            System.out.println( result);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
