import java.util.*;
public class _560_Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int preSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
    map.put(0,1);
        for(int num:nums){
            preSum+=num;
            if(map.containsKey(preSum-k)){
                count+=map.get(preSum-k);
            }
            if(map.containsKey(preSum)){
                map.put(preSum,map.get(preSum)+1);
            }
            else{
                map.put(preSum,1);
            }
        }
        return count;
        
    }
}
