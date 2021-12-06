package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSet {
    public void LearnHashSet(){
       Set<String> set = new java.util.HashSet<String>();
       set.add("Selenium");
       set.add("Automation");
       set.add("Framework");
       set.add("Selenium");
       System.out.println(".......");

//        for (int i = 0; i< set.size(); i+=1){
//        System.out.println(set);
//            }

//        for (String var: set){
//            System.out.println(var);
//        }

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            String var = itr.next();
            if (var.equals("Selenium")){ //if i want to print selenium
                System.out.println(var);
            }
        }
    }

    public void LearnHashMap(){
        HashMap< String, String> hashMap = new HashMap<>();
        hashMap.put("IE", "Internet Explorer");
        hashMap.put("chrome", "Google Chrome");
        hashMap.put("safari", "Apple macBook Browser");
        hashMap.put("Firefox", "Mozilla Firefox");

        System.out.println("Browser Name is: " + hashMap.get("chrome"));
        System.out.println(hashMap);

        if (hashMap.containsKey("IE")){
            System.out.println(hashMap.get("IE"));
        }

        for (Map.Entry map: hashMap.entrySet()){
            System.out.println(map.getKey() + " : " + map.getValue());
        }


    }
}
