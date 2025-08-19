public class _162_Find_Peak_Element {
    
        public int findPeakElement(int[] nums) {
            int left=0;
            int n=nums.length;
            int right=n-1;
            while(right>left){
                int mid=left+(right-left)/2;
                if(nums[mid]<nums[mid+1]){
                    left=mid+1;
                }
                else{
                    right=mid;
                }
            }
            return left;
            
        }
    
    
}
