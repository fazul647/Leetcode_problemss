import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56_Merge_Intervals {

   
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged=new ArrayList<>();
        int[] current=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] next=intervals[i];
            if(next[0]<=current[1]){
                current[1]=Math.max(current[1],next[1]);
            }
            else{
                merged.add(current);
                current=next;
            }
        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
        
    }

    
}
