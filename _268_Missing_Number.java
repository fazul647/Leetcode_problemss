public class _268_Missing_Number {
    
 public int missingNumber(int[] nums) {
    int n=nums.length;
    int maxSum=n*(n+1)/2;
    int actualSum=0;
    for(int i=0;i<n;i++){
        actualSum+=nums[i];
    }
    return maxSum-actualSum;
}
}
