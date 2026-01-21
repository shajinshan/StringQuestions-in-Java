package Basic;

public class RomanNumberInteger {

    public static void main(String[] args) {
        System.out.println(romanToDecimal("XII"));
    }
    public static int romanToDecimal(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = n-1; i >= 0; i--) {
            char r = s.charAt(i);

            if(i>0) {
                char l = s.charAt(i - 1);

                if (findValue(r) > findValue(l)) {
                    sum += findValue(r);
                    sum -= findValue(l);
                    i--;

                }
                else {
                    sum += findValue(r);
                }
            }
                else {
                    sum += findValue(r);
                }

        }
        return sum;
    }
// code here
//        int n = s.length();
//        int sum = 0;
//
//        for(int i=n-1; i>=0; i--) {
//            char l = s.charAt(i);
//
//            if(i > 0) {
//                char sl = s.charAt(i-1);
//                if(findValue(l) > findValue(sl)) {
//                    sum += findValue(l);
//                    sum -= findValue(sl);
//                    i--;
//                } else {
//                    sum += findValue(l);
//                }
//            } else {
//                sum += findValue(l);
//            }
//        }
//
//        return sum;
//    }
//
  public static int findValue(char c) {
       if (c == 'I') {
           return 1;
       } else if (c == 'V') {
           return 5;
       } else if (c == 'X') {
           return 10;
       } else if (c == 'L') {
           return 50;
       } else if (c == 'C') {
           return 100;
       } else if (c == 'D') {
           return 500;
       } else {
           return 1000;
       }
   }
}
