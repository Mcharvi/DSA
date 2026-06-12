package HashSet;
import java.util.HashSet;
import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        //insert O(1)

        // In hashset, one element can only occur once- NO DUPLICATES, no change will come, it wont get added again.
        


        set.add(20);
        set.add(100);
        set.add(10);
        set.add(200);
        set.add(-8);

        for(int ele : set){
            System.out.print(ele + " ");
        }
    }
    
}
