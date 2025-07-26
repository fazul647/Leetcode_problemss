public class _136_Single_Number{
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR each number
        }
        return result;
    
    }

}