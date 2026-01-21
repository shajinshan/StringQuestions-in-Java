package Basic;

public class Check_String {
    public static void main(String[] args) {
        System.out.println(check("ddddd"));
    }
   static Boolean check (String s)
    {
        // your code here
     int count = 0;
     char ch = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if(ch == s.charAt(i)){
                count++;
            }
        }
        return count == s.length() ? true :false;
    }
}
