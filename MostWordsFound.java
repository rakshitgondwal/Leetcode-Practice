public class MostWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj", "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom", "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg", "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm", "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr", "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk", "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo", "qstd zui nbbohtuk", "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        if (sentences.length == 0) {
            return -1;
        }
            int ans = 0;


            for (int i = 0; i < sentences.length - 1; i++) {
                for (int j = 0; j < sentences[i].length(); j++) {
                    if (sentences[i].charAt(j) == ' ') {
                        ans += 1;
                    }
                }
            }
            return ans + 1;

        }
    }




        /*   if (sentences.length == 0) {
            return -1;
        }
        int max = 0;
        int maxArr = 0;
        int answer = 0;

        for (int i = 0; i < sentences.length - 1; i++) {


            if (sentences[i].length() > sentences[i + 1].length()) {
                max = sentences[i].length();
                maxArr = i;
            } else {
                max = sentences[i + 1].length();
                maxArr = i+1;
            }
        }

        String ans = sentences[maxArr];
        int j =0;
        while (j < max) {
            for (int i = 0; i < max; i++) {
            if (ans.charAt(i) == ' ') {
                answer += 1;
            }j += 1;
        }
        } return answer+1;

        }*/

