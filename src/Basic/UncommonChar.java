package Basic;


public class UncommonChar {
    public static void main(String[] args) {
        String s1 = "characters", s2 = "alphabets";
        System.out.println(uncommonChars(s1,s2));
    }
   public static String uncommonChars(String s1, String s2) {
        // code here
       int[] hash = new int[26];

       for (int i = 0; i < s1.length(); i++) {
           hash[s1.charAt(i) - 'a'] = 1;
       }
       for (int i = 0; i < s2.length(); i++) {
         if( hash[s2.charAt(i) - 'a'] == 1){
             hash[s2.charAt(i) - 'a'] = -1;
           }
         else if(hash[s2.charAt(i) - 'a'] == 0){
             hash[s2.charAt(i) - 'a'] = 2;
         }
       }

       String str ="";
       for (int i = 0; i < hash.length ; i++) {
           if(hash[i] == 1 || hash[i] == 2){
                str += (char)('a' + i);
           }
       }
       System.out.println(str);
         return "hi";

    }
}
