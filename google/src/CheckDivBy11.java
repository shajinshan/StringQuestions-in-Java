import java.util.Map;

public class CheckDivBy11 {
    public static void main(String[] args) {
      String s = "940948824551711527614232216857618927954312";
        System.out.println(divisibleBy11(s));
    }

   public static int divisibleBy11(String S) {
        // Your Code Here
       int odd =0,even = 0;
       for (int i = 0; i < S.length(); i++) {
           int digit = S.charAt(i) - '0';
           if(i%2==0){
               even += digit;
           }else {
               odd+=digit;
           }
       }

      int num = Math.abs(odd-even);
       return num % 11 == 0? 1:0;
    }
}
