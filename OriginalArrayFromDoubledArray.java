import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OriginalArrayFromDoubledArray {
    public static void main(String[] args) {
        int [] changed = {1,3,4,2,6,8};
        System.out.println(Arrays.toString(findOriginalArray(changed)));
    }
    public static int[]findOriginalArray(int [] changed){
        List<Integer> ansList = new ArrayList<>();
        Arrays.sort(changed);
        int counter = 0;

        for (int i = 0; i < changed.length-1 && counter< changed.length/2; i++) {
            for (int j = i+1; j < changed.length; j++) {
                if (changed[i] == changed[j]){
                    break;
                }
                if (2*changed[i] == changed[j]){
                    ansList.add(changed[i]);
                    counter++;
                    break;
                }
            }
        }
        int [] ans = new int[ansList.size()];
        int [] notAns = {};

        if (ansList.size() == changed.length/2){
            for (int i = 0; i < ansList.size() ; i++) {
                ans[i] = ansList.get(i);
            }
        } else return notAns;
        return ans;
    }
}
