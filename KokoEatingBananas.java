public class KokoEatingBananas {
    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
    public static int minEatingSpeed(int [] piles, int h){
        int s = 1;
        int e = 1_000_000_000;

        while(s<e){
            int mid = s+(e-s)/2;
            if (isPossible(piles,h,mid)){
                e=mid;
            }else {
                s=mid+1;
            }
        } return s;
    }

    public static boolean isPossible(int[]piles, int h, int k){
        int time= 0;
        for (int i:piles) {
                time+=(i-1)/k +1;
                if (time >h){
                    break;
            }
        }return time<=h;
    }
}
