package HashSet;

import java.util.HashSet;

public class basicSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //insert O(1)


        set.add(20);
        set.add(100);
        set.add(10);
        set.add(200);
        set.add(-8);

        //search -t/f : O(1)
       // System.out.println(set.contains(10));

       //size O(1)
       // System.out.println(set.size());

        //for iteration: 

       for(int ele : set){
        System.out.print(ele + " ");

        //u cant add/remove while iteration

       }
       System.out.println();
       set.clear();
       System.out.println(set);



    }
    
}
