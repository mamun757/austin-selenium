package practice;


import java.util.Map;
import java.util.Set;

public class HashMap {
    public void LearnHashMap(){
        Map<String, String> map = new java.util.HashMap<>();
        map.put("FirstName", "Mamun");
        map.put("LastName", "Md Abdullah");
        map.put("Address", "Jamaica");
        map.put("Zipcode", "11435");
        map.put("Phone", "3458973422");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println("user phone is: " + map.get("Phone"));

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println("Key is: " + key+ " And value is: " + map.get(key));
        }
    }
}
