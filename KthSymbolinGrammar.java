//See the tree below to see how values in each row relate to the parent row values. The rows and the indexes for the nodes in each row are 1-based.
//
//        Row1	        			  0
//                               /       \
//        Row2					0          1
//                             /   \      /    \
//        Row3				  0     1     1      0
//                           / \    / \   / \   / \
//        Row4				0  1   1   0  1  0  0  1
//
//        Index(for Row 4)->  1  2   3   4  5  6  7  8
//        Notice that:
//
//        the parent of kth index in nth row is
//        k/2 index in the n-1 row for even numbered indexes.
//        (k+1)/2 index in the n-1 row for odd numbered indexes.
//        Also notice that the kth value of the index in nth row is:
//
//        flipped (reversed) value of the parent i.e. k/2 index in the n-1 row for even numbered indexes.
//        same value as for the parent i.e. the (k+1)/2 index in the n-1 row for odd numbered indexes.
//        which gets us to this solution:


public class KthSymbolinGrammar {
    public static void main(String[] args) {
        System.out.println(kthGrammar(2,2));
    }
    public static int kthGrammar(int N, int K) {

        // base case
        if(N==1) {
            return 0;
        }

        if(K%2==1) {
            return kthGrammar(N-1, (K+1)/2);
        } else {
            return flip(kthGrammar(N-1, K/2));
        }
    }

    public static int flip(int val) {
        return val==0? 1 : 0;
    }
}









//The solution below is more optimized than the above one but the above one is more understandable.



//public class KthSymbolinGrammar {
//    public static void main(String[] args){
//        System.out.println(kthGrammar(4,2));
//    }
//    public static int kthGrammar(int n, int k){
//        if(n==1) {
//            return 0;
//        }
//        int parent = kthGrammar(n-1, (k+1)/2);
//        if(k%2 == 0) {
//            return parent == 1? 0 : 1;
//        } else {
//            return parent;
//        }
//    }
//}




//The below ans, I solved it using a stringbuilder but I forgot that stringbuilder has a size limit
//which is smaller than the max ans this question can get. Thus, this solution throws a time limit exceeded error.


//public class KthSymbolinGrammar {
//    public static void main(String[] args) {
//        System.out.println(kthGrammar(29,1));
//    }
//    public static int kthGrammar  (int n, int k){
//        StringBuilder ans = new StringBuilder();
//      findAns("0",n,ans);
//
//      return Character.getNumericValue(ans.charAt(k-1));
//    }
//    public static void findAns (String check, int count, StringBuilder ans){
//        if (count == 0){
//           ans.append(check);
//            return;
//        }
//        for (int i = 0; i < check.length(); i++) {
//            if (Character.getNumericValue(check.charAt(i)) == 0){
//            findAns("01", count-1,ans);
//            }
//            if (Character.getNumericValue(check.charAt(i)) + 0 == 1){
//             findAns("10", count-1,ans);
//            }
//
//        }
//        return;
//    }
//
//}
