public class ReverseWithIntnt {
    public static void main(String[] args) {

        String s = "Help others";
        //           i    r
        //          ol   eh

        System.out.println(reverseWithSpacesIntact(s));
    }

   static String reverseWithSpacesIntact(String str) {
        // your code here
        char[] S = str.toCharArray();
        int l =0 ,r=S.length-1;

        while (l<r){
            if(S[l] != ' ' && S[r] != ' ' ){
                char tmp = S[l];
                S[l] = S[r];
                S[r] = tmp;
                l++;
                r--;
            }
            if(S[l] == ' '){
                l++;
            } else if (S[r] == ' ') {
                r--;
            }
        }
        return String.valueOf(S);
    }
}
