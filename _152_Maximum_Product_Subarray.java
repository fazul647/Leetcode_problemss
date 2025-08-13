public class _152_Maximum_Product_Subarray{
public int maxProduct(int[] nums) {
    int prefix=1;
    int suffix=1;
    int result=Integer.MIN_VALUE;
    int n=nums.length;
    for(int i=0;i<nums.length;i++){
        if(prefix==0)prefix=1;
        if(suffix==0)suffix=1;
        prefix=prefix*nums[i];
        suffix=suffix*nums[n-i-1];
        result=Math.max(result,Math.max(prefix,suffix));
    }
    return result;
   
}
}