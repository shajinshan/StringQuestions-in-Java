package Basic;

public class Anagram_palindrome {
    public static void main(String[] args) {
        System.out.println(isPossible("geeksogeeks"));
    }
    static int isPossible (String S)
    {
        // your code here
        String res = "";

        for(int i =S.length()-1;i>=0;i--){
            res += S.charAt(i);
        }
        System.out.println(res);
        if(res.equals(S)){
            return 1;
        }

        return 0;
    }
}
