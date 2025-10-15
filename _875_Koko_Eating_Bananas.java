public class _875_Koko_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=getMax(piles);
        while(left<right){
            int mid=(right+left)/2;
            int hours=getHours(piles,mid);
            if(hours>h){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
    private int getMax(int[] piles){
        int max=0;
        for(int pile:piles){
            if(pile>max){
                max=pile;
            }
        }
        return max;
    }
    private int getHours(int[] piles,int speed){
        int totalhours=0;
        for(int pile:piles){
            totalhours+=(pile + speed - 1) / speed;
        }
        return totalhours;
    }
    
}
