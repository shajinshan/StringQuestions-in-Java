import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str="programing";

        HashSet<Character>hashSet=new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            hashSet.add(str.charAt(i));
        }

        System.out.println(hashSet);
    }
}
