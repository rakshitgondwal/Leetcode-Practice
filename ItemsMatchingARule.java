import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemsMatchingARule {
    public static void main(String[] args){
        List<List<String>> huh = new ArrayList<>();
        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        List<String> third = new ArrayList<>();

        first.add("phone");
        first.add("blue");
        first.add("pixel");

        second.add("computer");
        second.add("silver");
        second.add("lenovo");

        third.add("phone");
        third.add("gold");
        third.add("iphone");

        huh.add(first);
        huh.add(second);
        huh.add(third);

        System.out.println(countMatches(huh,"color","silver"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int ans = 0;
        int check = 0;
        if (ruleKey.charAt(0) == 't'){
            check = 0;
        } else if (ruleKey.charAt(0) == 'c'){
            check = 1;
        }else check = 2;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(check).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
}
