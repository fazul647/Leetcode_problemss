import java.util.ArrayList;
import java.util.List;

public class _118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

         List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j=1;j<prevRow.size();j++){
                int sum=prevRow.get(j-1)+prevRow.get(j);
                currRow.add(sum);

            }
            currRow.add(1);
            result.add(currRow);
            
        }
    return result;
        
    }
    
}
