public class _152_Maximum_Product_Subarray{
public int maxProduct(int[] nums) {
    int maxprod = nums[0];
   int minprod = nums[0];
   int result = nums[0];

   for (int i = 1; i < nums.length; i++) {
       int num = nums[i];

       // Step 1: If num is negative, swap max and min
       if (num < 0) {
           int temp = maxprod;
           maxprod = minprod;
           minprod = temp;
       }

       // Step 2: Update max and min products for current index
       maxprod = Math.max(num, num * maxprod);
       minprod = Math.min(num, num * minprod);

       // Step 3: Update result
       result = Math.max(result, maxprod);
   }

   return result;
   
}
}