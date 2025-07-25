public class _485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;

            }
            else{
                high=Math.max(high,sum);
                sum=0;
            }
        }
        
         return Math.max(high, sum);
    }
}
