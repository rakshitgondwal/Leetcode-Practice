public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abca";

        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t){
        int charCodeS = 0, charCodeT = 0;

        for (int i = 0; i < s.length(); ++i){
            charCodeS += (int)s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i){
            charCodeT += (int)t.charAt(i);
        }

        return (char)(charCodeT - charCodeS);
    }
}

//The below solution was written by myself, it worked for every case but it was giving the wrong answer when
//  s= a & t = aa.    Thus the above solution works perfectly for every case.



//    public static char findTheDifference(String s, String t){
//
//        for (int i = 0; i < t.length(); i++) {
//           boolean ans = linearSearch(s,t.charAt(i));
//
//            if (ans == false){
//                return t.charAt(i);
//            }
//        } return 0;
//
//
//    }
//
//    public static boolean linearSearch(String main,char target){
//
//        for (int i = 0; i < main.length(); i++) {
//            if (main.charAt(i) == target){
//                return true;
//            }
//        } return false;
//
//    }
//}
