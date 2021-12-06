package practice;

public class IfAndElseStatements {

    public void IfStatement(int x){
        if (x < 20){
            System.out.println("This is If Statement");
        }
    }

    public void IfAndElse(int y){
        if (y <20){
            System.out.println("This is a If Statement");
        }else {
            System.out.println("This is a Else Statement");
        }
    }

    public void NestedIfStatements(){
        int x = 10;
        int y = 5;
        if (x <20){
            if (y < 10){
                System.out.println("X is:" + x + " And Y is: " + y);
            }
        }
    }
}
