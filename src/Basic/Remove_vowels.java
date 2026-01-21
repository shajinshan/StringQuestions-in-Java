package Basic;

public class Remove_vowels {
    public static void main(String[] args) {
        System.out.println(removeVowels("aeiouw"));
    }

    static String removeVowels(String s) {
        // code here

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

            }
            else {
                res+=c;
            }
        }
        return res;
    }
}