class _153_Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        if(nums[l]<=nums[r]) return nums[0];
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid<r && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>l && nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if (nums[mid] >= nums[l]) {
                l = mid + 1; // Search right half
            } else {
                r = mid - 1; // Search left half
            }
        }
        return -1;
        
    }
}