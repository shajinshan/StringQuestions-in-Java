package Basic;

public class Check_for_Binary_String {
   public static boolean isBinary(String s) {
        // Your code here
       for (int i = 0; i <s.length() ; i++) {
           if (s.charAt(i) != '0' || s.charAt(i) != '1'){
               return false;
           }
       }
       return true;
    }
}

