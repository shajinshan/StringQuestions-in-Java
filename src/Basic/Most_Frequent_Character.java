package Basic;

public class Most_Frequent_Character {
    public static void main(String[] args) {
String str = "output";
        System.out.println(getMaxOccuringChar(str));
    }

    public static char getMaxOccuringChar(String s) {
        // Your code here

        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;

        }

        int max = -1;
        int index =-1;
        for (int i = 26-1; i >=0; i--) {

           if( max <= hash[i]){
               max = hash[i];
               index = i;

           }
        }

        return (char) ('a' + index);
    }
}
