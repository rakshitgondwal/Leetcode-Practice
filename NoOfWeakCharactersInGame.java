import java.util.Arrays;

public class NoOfWeakCharactersInGame {
    public static void main(String[] args) {
      int[][] properties = {{7,7},{1,2},{9,7},{7,3},{3,10},{9,8},{8,10},{4,3},{1,5},{1,5}};
        System.out.println(noOfWeakCharacters(properties));
    }
    public static int noOfWeakCharacters(int [] [] properties){
        Arrays.sort(properties, (a, b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

        int noOfWeakCharacters = 0;
        int len = properties.length;
        int max = properties[len-1][1];

        for(int i = len-2; i>=0 ;i--) {

            if(properties[i][1] < max) {
                noOfWeakCharacters++;
            } else {
                max = properties[i][1];
            }
        }
        return noOfWeakCharacters;


     ////////////////////////////////////  TIME LIMIT EXCEEDED  ////////////////////////////////////////////////////
//        int weak = 0;
//
//        for (int i = 0; i < properties.length; i++) {
//            int att = properties[i][0];
//            int def = properties[i][1];
//
//            for (int j = 0; j < properties.length; j++) {
//                int currAtt = properties[j][0];
//                int currDef = properties[j][1];
//
//                if (currAtt>att && currDef>def){
//                    weak+=1;
//                    break;
//                }
//            }
//        }
//        return weak;
    }
}
