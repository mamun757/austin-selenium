package practice;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {
    public void GenericArrayList(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(11);
        list.add(null);
        int i = list.get(0);
        System.out.println(i);
        System.out.println("------");
        for ( Object var: list){
            System.out.println(var);
        }
    }
}
