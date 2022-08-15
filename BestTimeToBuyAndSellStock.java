public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        //O(n) time complexity below.
        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
                lsf = prices[i]; // update our least so far
            }
            pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
            if(op < pist){ // if pist is more then our previous overall profit
                op = pist; // update overall profit
            }
        }
        return op;
    }
}


// Ans below is O(n^2) time complexity


//        int max = 0;
//        for(int i = 0; i<prices.length -1; i++){
//            for(int j =i+1; j<prices.length; j++){
//                if(prices[i]<prices[j]){
//                    max = Math.max(max,prices[j] - prices[i]);
//                } else {
//                    break;
//                }
//            }
//
//        } return max;
//    }
//}
