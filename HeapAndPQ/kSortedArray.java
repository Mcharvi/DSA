package HeapAndPQ;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class kSortedArray {

    public static void main(String[] args) {
         int [] arr = {6,5,3,2,8,10};
        int k = 4;
        //min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k){
                ans.add(pq.remove());
            }
        }

        while(pq.size()>0){
            ans.add(pq.remove());
        }

    
        System.out.println(ans);
    }
    
}
