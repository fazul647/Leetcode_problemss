public class _48_Rotate_Image {
    public void rotate(int[][] matrix) {

        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                if(i!=j){
                    int temp=matrix[j][i];
                    matrix[j][i]=matrix[i][j];
                    matrix[i][j]=temp;

                }
            }
        }

       for(int i=0;i<matrix.length;i++){
        int left=0;
        int right=matrix.length-1;
        while(left<right){
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
            left++;
            right--;
        }
       }
        
    }
    
}
