import java.util.ArrayList;
import java.util.List;

public class _229_Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int candiate1 = 0, candiate2 = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            if (num == candiate1) {
                count1++;
            } else if (num == candiate2) {
                count2++;
            } else if (count1 == 0) {
                candiate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candiate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Reset counters for final verification
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candiate1) count1++;
            if (num == candiate2) count2++;
        }

        if (count1 > nums.length / 3) list.add(candiate1);
        // Avoid duplicate if both candidates are the same
        if (candiate2 != candiate1 && count2 > nums.length / 3) list.add(candiate2);

        return list;
    }
    
}
