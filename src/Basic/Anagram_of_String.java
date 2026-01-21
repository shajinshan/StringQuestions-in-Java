package Basic;

public class Anagram_of_String {
    public static void main(String[] args) {
        String s1 = "bcadeh",s2="hea";
        System.out.println(remAnagrams(s1,s2));
    }
    public static int remAnagrams(String s1, String s2) {
        // add code here.

        int func1[] = new int[26];
        int func2[] = new int[26];

        for(char ch : s1.toCharArray()) {
            func1[ch-'a']++;
        }

        for(char ch : s2.toCharArray()) {
            func2[ch-'a']++;
        }

        int difference = 0;

        for(int i=0; i<26; i++) {
            difference += Math.abs(func1[i] - func2[i]);
        }
        if (difference == 0) {
            return 0;
        }

        return difference;
        }

}
