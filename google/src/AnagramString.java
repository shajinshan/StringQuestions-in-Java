public class AnagramString {

    public static void main(String[] args) {
        System.out.println(areAnagram("gekse","geeks"));
    }
    static int areAnagram(String S1, String S2) {
        // code here
        if(S1.length() != S2.length()){
            return 0;
        }

        int[] hash = new int[256];
        for (int i = 0; i < S1.length(); i++) {
            hash[S1.charAt(i)]++;
        }
        for (int i = 0; i < S1.length(); i++) {

            hash[S2.charAt(i)]--;
        }
        for (int i = 0; i < hash.length; i++) {
            if(hash[i] != 0){
                return 0;
            }

        }
        return 1;

    }
}
