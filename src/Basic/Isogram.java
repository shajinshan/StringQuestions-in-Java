package Basic;

import java.util.HashSet;

public class Isogram {
    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(isIsogram(s));
    }
    static boolean isIsogram(String data){
        //Your code here
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < data.length(); i++) {
            set.add(data.charAt(i));
        }

        return set.size() == data.length() ? true :false;
    }
}
