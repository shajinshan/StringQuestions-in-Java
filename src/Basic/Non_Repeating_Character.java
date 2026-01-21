package Basic;

import java.util.HashMap;
import java.util.Map;

public class Non_Repeating_Character {
    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("geeksforgeeks"));
    }
    static char nonRepeatingChar(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c) == 1){
                return c;
            }
        }
        return '$';
    }
}
