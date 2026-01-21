package Basic;

public class Reversing_Vowels {
    public static void main(String[] args) {
        System.out.println(vowels("practice"));
    }
    public static String vowels(String s){

        String vowels = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'){
                vowels += c;
            }
        }
        StringBuilder sb=new StringBuilder();
        int j = vowels.length()-1;
        for (int i = 0; i <s.length() ; i++) {
            char c =s.charAt(i);
            if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'){
               sb.append(vowels.charAt(j));
               j--;
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
