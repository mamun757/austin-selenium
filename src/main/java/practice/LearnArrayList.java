package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

    public void ArrayList(){
        ArrayList list = new ArrayList();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("----------");

        list.add(10);
        list.add("Mamun");
        list.add('A');
        list.add(10.25);
        list.add(true);
        list.add(null);
        list.add("Mamun");

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove(6);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("----------");

        // First way
//        for (int index = 0; index < list.size(); index +=1){
//            System.out.println(list.get(index));
//        }
        System.out.println("----------");
        //Second way
        for (Object lists :list ){
            System.out.println("Printing List is: " + list);
//
        //Third way
//        Iterator itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
        }
    }
}
