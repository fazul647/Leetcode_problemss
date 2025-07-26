import java.util.Hashtable;
public class _1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
       Hashtable<Integer,Integer> table=new Hashtable<>();
       for(int i=0;i<nums.length;i++){
        int c=target-nums[i];
        if(table.containsKey(c)){
            return new int[] {table.get(c),i};
        }
        table.put(nums[i],i);
       }
       return new int[]{-1,-1};
    }
    
}
