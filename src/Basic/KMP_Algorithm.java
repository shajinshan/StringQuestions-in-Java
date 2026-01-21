package Basic;

import java.util.Stack;

public class KMP_Algorithm {
        // Function to check if two strings are rotations of each other
        public static boolean areRotations(String s1, String s2) {
            int n = s1.length();

            // If lengths are different, return false
            if (n != s2.length())
                return false;

            // Concatenate s1 with itself
            String concatenated = s1 + s1;

            // Use KMP algorithm for efficient substring search
            return kmpSearch(concatenated, s2);
        }



        // KMP Algorithm for substring search (O(N) time complexity)
        private static boolean kmpSearch(String text, String pattern) {
            int[] lps = computeLPS(pattern);
            int i = 0, j = 0;
            int n = text.length(), m = pattern.length();
            while (i < n) {
                if (text.charAt(i) == pattern.charAt(j)) {
                    i++;
                    j++;
                    if (j == m) return true; // Pattern found
                } else if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
            return false;
        }

        // Compute the LPS (Longest Prefix Suffix) array for KMP
        private static int[] computeLPS(String pattern) {
            int m = pattern.length();
            int[] lps = new int[m];
            int i = 1, len = 0;

            while (i < m) {
                if (pattern.charAt(i) == pattern.charAt(len)) {
                    lps[i++] = ++len;
                } else if (len > 0) {
                    len = lps[len - 1];
                } else {
                    lps[i++] = 0;
                }
            }
            return lps;
        }

        public static void main(String[] args) {
            System.out.println(areRotations("bhgh", "abcc")); // true
            System.out.println(areRotations("abcd", "acbd")); // false
        }

}
