import java.util.HashMap;
import java.util.Map;

public class EncryptString {

    public static void main(String[] args) {
        String s= "a";
        System.out.println(encryptString(s));
    }
    static String encryptString(String s) {
        int dup=1;

        StringBuilder str=new StringBuilder();

        if(s.length() == 1){
           str.append(s.charAt(0)).append(1);
           return str.reverse().toString();
        }

        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                dup++;
                    if (i+1 == s.length()-1) {
                    str.append(s.charAt(i)).append(dup);
                }
            }  else {
                str.append(s.charAt(i)).append(dup);
                dup=1;
                if (i+1 == s.length()-1) {
                    str.append(s.charAt(i+1)).append(dup);
                }
            }

        }
        return str.reverse().toString();
    }
}
