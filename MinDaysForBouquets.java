public class MinDaysForBouquets {
    public static void main(String[] args) {
        int [] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k =1;
        System.out.println(minDays(bloomDay,m,k));
    }
    public static int minDays(int [] bloomDay, int m, int k){
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        int n = bloomDay.length;

        // Flowers are not enough for making a boque
        if(m * k > n) return -1;

        for(int i = 0; i < n; i++) {
            minDay = Math.min(minDay, bloomDay[i]);
            maxDay = Math.max(maxDay, bloomDay[i]);
        }

        int start = minDay; // (trick) start = 0
        int end = maxDay; // end = (int)1e9
        int ans = -1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return ans;
    }
    public static boolean isPossible(int[] bloomDay, int currDay, int m, int k) {
        int flowers = 0;
        int boques = 0;
        int n = bloomDay.length;
        for(int i = 0; i < n; i++) {
            if(bloomDay[i] <= currDay) flowers++; // consecutive flowers
            else flowers = 0;
            if(flowers == k) {
                flowers = 0;
                boques++;
                if(boques == m) return true;
            }
        }
        return false;
    }
}
