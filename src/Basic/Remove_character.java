package Basic;

public class Remove_character {
    public static void main(String[] args) {
        System.out.println(removeChars("computer", "cat"));
    }
    static String removeChars(String string1, String string2){
        // code here

        String res = "";
        for(int i =0;i<string1.length();i++){
            if(!string2.contains(string1.charAt(i)+"") ){
                res += string1.charAt(i);
            }
        }
        return res;
    }
}
