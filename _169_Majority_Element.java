public class _169_Majority_Element {
    public int majorityElement(int[] nums) {

        //Moore’s Voting Algorithm
        int candiate=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candiate=nums[i];
                count++;
            }
            else if(nums[i]!=candiate){
                count--;
            }
            else{
                count++;
            }
        }
        return candiate;
    }
    
}
