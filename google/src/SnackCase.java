public class SnackCase {
    public static void main(String[] args) {

        int n =14;
        String s = "Geeks ForGeeks";

        System.out.println(snakeCase(s,n));
    }

    static String snakeCase(String S, int n) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if(S.charAt(i) == ' '){
                str.append('_');
            }
            else {
                str.append(S.charAt(i));
            }
        }
return str.toString().toLowerCase();
    }
}
