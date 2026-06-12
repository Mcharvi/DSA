package HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class LC1207 {

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){

            if(map.containsKey(i)){
                int freq = map.get(i);
                map.put(i,freq+1);
            }
            else{
                map.put(i,1);
            }

        }

        HashSet<Integer> set = new HashSet<>();

        for(int val : map.values()){

            set.add(val);
        }
        
        return (map.size()== set.size());
    }
}
    

