public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "The sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
            if (s == null) return null;

            char[] a = s.toCharArray();
            int n = a.length;

            // step 1. reverse the whole string
            reverse(a, 0, n - 1);
            // step 2. reverse each word
            reverseWords(a, n);
            // step 3. clean up spaces
            return cleanSpaces(a, n);
        }

        public static void  reverseWords(char[] a, int n) {
            int i = 0, j = 0;

            while (i < n) {
                while (i < j || i < n && a[i] == ' ') i++; // skip spaces
                while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
                reverse(a, i, j - 1);                      // reverse the word
            }
        }

        // trim leading, trailing and multiple spaces
        public static String  cleanSpaces(char[] a, int n) {
            int i = 0, j = 0;

            while (j < n) {
                while (j < n && a[j] == ' ') j++;             // skip spaces
                while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
                while (j < n && a[j] == ' ') j++;             // skip spaces
                if (j < n) a[i++] = ' ';                      // keep only one space
            }

            return new String(a).substring(0, i);
        }

        // reverse a[] from a[i] to a[j]
        private static void reverse(char[] a, int i, int j) {
            while (i < j) {
                char t = a[i];
                a[i++] = a[j];
                a[j--] = t;
            }
        }

    }

