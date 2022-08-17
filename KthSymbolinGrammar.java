public class KthSymbolinGrammar {
    public static void main(String[] args){
        System.out.println(kthGrammar(4,2));
    }
    public static int kthGrammar(int n, int k){
        if(n==1) {
            return 0;
        }
        int parent = kthGrammar(n-1, (k+1)/2);
        if(k%2 == 0) {
            return parent == 1? 0 : 1;
        } else {
            return parent;
        }
    }
}




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
