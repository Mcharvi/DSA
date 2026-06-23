package HeapAndPQ;

import java.util.PriorityQueue;

public class kthSmallestElement {


    public static void main(String[] args) {
        int [] arr = {10,2,8,3,-6,-2,9,-12};
        int k = 4;
        //min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        for(int i = 1; i<k; i++){
            pq.remove();
        }
        System.out.println(pq.peek());


    }
    
}
