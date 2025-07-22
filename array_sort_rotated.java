public class array_sort_rotated {
    
        public boolean check(int[] nums) {
    
            //we check how many time nums[i]>nums[i+1] if it is greater than two times return false else return true
    
        int count=0;
            for(int i=0;i<nums.length;i++){
                int next=(i+1)%nums.length;
                if(nums[i]>nums[next]){
                    count++;
                }
            }
            return count<=1;
        }
    }
    

