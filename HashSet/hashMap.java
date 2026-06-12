
package HashSet;
import java.util.*;

public class hashMap {

    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();

        map.put("Charvi", 10);
        map.put("Piyu", 12);
        map.put("Vipul", 11);
        System.out.println(map);
        map.put("Charvi", 28);

        //value gets replaces (overwritten)
        System.out.println(map);

        map.put("Arsh", 28);
        //duplicate values allowed, duplicate keys not allowed
        System.out.println(map);
        System.out.println(map.size());

        //other methods: map.remove()-> when u remove key and value both get removed, map.containsKey(), map.containsValue()

        System.out.println(map.get("Charvi"));
        //in get we put key and get the value
        
    }
    
}
