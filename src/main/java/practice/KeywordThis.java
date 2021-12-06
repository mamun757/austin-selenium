package practice;

public class KeywordThis {

    int a;
    int b;
    public void MyAccount(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void ShowData(){
        System.out.println(a);
        System.out.println(b);
    }
}
