package Basic;

public class JavaStrings {
    static String conRevstr(String S1, String S2) {
        // code here
        StringBuilder sb =new StringBuilder();
        sb.append(S1);
        sb.append(S2);

        String s ="";
        s.toUpperCase();
       sb.reverse();
        return sb.toString();

    }
}
