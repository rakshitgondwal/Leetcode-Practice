public class SumOfBeautyOfAllSubstrings {
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
    }
    private static int getMinCount(int[] charCount) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < charCount.length; ++i) {
            if (charCount[i] != 0) {
                min = Math.min(min, charCount[i]);
            }
        }

        return min;
    }

    private static int getMaxCount(int[] charCount) {
        int max = 0;

        for (int i = 0; i < charCount.length; ++i) {
            max = Math.max(max, charCount[i]);
        }

        return max;
    }

    public static int beautySum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); ++i) {
            int[] charCount = new int[26]; // initialize charCount to all 0

            for (int j = i; j < s.length(); ++j) {
                ++charCount[s.charAt(j) - 'a'];

                // get beauty of substring from i to j
                int beauty = getMaxCount(charCount) - getMinCount(charCount);
                sum += beauty;
            }
        }

        return sum;
    }
}
