package HashSet;
import java.util.HashMap;
import java.util.HashSet;


public class LC242 {

    public boolean isAnagram(String s, String t){

        if(s.length()!=t.length()) {
            return false;
        }
        HashMap<Character, Integer> smap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            if(smap.containsKey(key)){
                int freq = smap.get(key);
                smap.put(key, freq+1);
            }
            else{
                smap.put(key,1);
            }
        }

    

    HashMap<Character, Integer> tmap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char key = t.charAt(i);
            if(tmap.containsKey(key)){
                int freq = tmap.get(key);
                tmap.put(key, freq+1);
            }
            else{
                tmap.put(key,1);
            }
        }

        for(int i=0; i<s.length(); i++){
            char key = t.charAt(i);
            if(smap.get(key)!=tmap.get(key)){
                return false;
            }
        }
            return true;
        
        
    }
    
}
