import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {

        String str="edcba";

        char[] val = str.toCharArray();

        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val.length-i-1; j++) {
                if (val[j] > val[j + 1]) {
                    char tmp = val[j];
                    val[j] = val[j + 1];
                    val[j + 1] = tmp;
                }
            }
        }

        String s =new String(val);

        System.out.println(s);

    }
}
