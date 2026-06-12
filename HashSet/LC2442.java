package HashSet;

import java.util.HashSet;

public class LC2442 {

    //given array nums of pos int
    //take every int, reverse its digits and add at end of array
    //return distinct
    public int countDistinctIntegers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for( int ele : nums){
            set.add(ele);
            set.add(reverse(ele));
        }
        
        int size = set.size();
        return size;
    }

    public int reverse(int n){

        int r=0;
        while(n!=0){
            r = r*10 + n%10;
            n = n/10;
        }

        return r;


    }
}
    

