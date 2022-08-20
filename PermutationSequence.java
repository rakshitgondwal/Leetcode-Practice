import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
        System.out.println(getPermutation(3,1));
    }
    public static String getPermutation(int n, int k){
        int colsize = 1;
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i<n;i++){
            colsize = colsize * i;
            ans.add(i);
        }
        ans.add(n);

        String res = "";
        k = k-1;
        while(true){
          res = res + ans.get(k/colsize);
          ans.remove(k/colsize);

          if (ans.size()==0){
              break;
          }

          k = k%colsize;
          colsize = colsize/ans.size();
        }

        return res;
    }
}
