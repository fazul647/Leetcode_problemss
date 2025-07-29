import java.util.*;
public class _128_Longest_Consecutive_Sequence{
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> num=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
        int longStreak=0;
        for(int i:num){
            if(!num.contains(i-1)){
                int currnum=i;
                int curS=1;
                while(num.contains(currnum+1)){
                    currnum++;
                    curS++;
                }
                longStreak=Math.max(longStreak,curS);
            }
        }
        return longStreak;
    }

}
